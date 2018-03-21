package pl.sda.projectY.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import pl.sda.projectY.bo.*;
import pl.sda.projectY.dto.AdminDto;
import pl.sda.projectY.dto.InstructorDto;
import pl.sda.projectY.dto.StudentDto;

/**
 * author:
 * Mateusz
 * Marczak
 **/
@Controller
public class AdminPageController {

    private final AdminService adminService;
    private final InstructorService instructorService;
    private final StudentService studentService;
    private final StudentFinder studentFinder;
    private final AdminFinder adminFinder;
    private final InstructorFinder instructorFinder;

    @Autowired
    public AdminPageController(AdminService adminService, InstructorService instructorService,
                               StudentService studentService, StudentFinder studentFinder, AdminFinder adminFinder, InstructorFinder instructorFinder) {
        this.adminService = adminService;
        this.instructorService = instructorService;
        this.studentService = studentService;
        this.studentFinder = studentFinder;
        this.adminFinder = adminFinder;
        this.instructorFinder = instructorFinder;
    }

    @PreAuthorize(value = "hasRole('ADMIN')")
    @GetMapping(value = "/panelAdmin")
    public String adminPage(){
        return "admin/adminPanel";
    }


    @GetMapping(value = "/panelAdmin/addAdmin")
    public ModelAndView addAdminPage(){
        ModelAndView mav = new ModelAndView("admin/addAdmin");
        AdminDto newAdmin = new AdminDto();
        mav.addObject("newAdmin",newAdmin);
        return mav;
    }

    @PostMapping(value = "/panelAdmin/addAdmin")
    public String  addNewAdmin(@ModelAttribute("newAdmin") AdminDto adminDto){
        adminService.addNewAdmin(adminDto);
        return "admin/successReg";
    }

    @PostMapping(value = "/panelAdmin/addInstructor")
    public String  addNewInst(@ModelAttribute("newInstructor") InstructorDto instructorDto){
        instructorService.addNewInst(instructorDto);
        return "admin/successReg";
    }

    @GetMapping(value = "/panelAdmin/addInstructor")
    public ModelAndView addInstructorPage(){
        ModelAndView mav = new ModelAndView("admin/addInstructor");
        InstructorDto newInstructor = new InstructorDto();
        mav.addObject("newInstructor",newInstructor);
        return mav;
    }

    @GetMapping(value = "/panelAdmin/addStudent")
    public ModelAndView addStudentPage(){
        ModelAndView mav = new ModelAndView("admin/addStudent");
        StudentDto newStudent = new StudentDto();
        mav.addObject("newStudent",newStudent);
        return mav;
    }

    @PostMapping(value = "/panelAdmin/addStudent")
    public String addNewStudent(@ModelAttribute("newStudent") StudentDto studentDto){
        studentService.addNewStudent(studentDto);
        return "admin/successReg";
    }

    @GetMapping(value = "/panelAdmin/studentList")
    public ModelAndView showAllStudents(){
        ModelAndView mav = new ModelAndView("admin/studentsList");
        mav.addObject("students",studentFinder.findAll());
        return mav;
    }

    @GetMapping(value = "/panelAdmin/instructorList")
    public ModelAndView showAllInstructors(){
        ModelAndView mav = new ModelAndView("admin/instructorsList");
        mav.addObject("instructors",instructorFinder.findAll());
        return mav;
    }

    @GetMapping(value = "/panelAdmin/adminList")
    public ModelAndView showAllAdmins(){
        ModelAndView mav = new ModelAndView("admin/adminsList");
        mav.addObject("admins",adminFinder.findAll());
        return mav;
    }

    @GetMapping(value = "/panelAdmin/studentList/student/{userId}}")
    public ModelAndView showStudentDetails(@PathVariable (value = "userId") int userId){
        ModelAndView mav = new ModelAndView("admin/studentDetails");
        mav.addObject("student",studentFinder.findById(userId));
        return mav;
    }

    @GetMapping(value = "/panelAdmin/studentList/studentE/{userId}")
    public ModelAndView editStudentDetailsPage(@PathVariable (value = "userId")int userId){
        ModelAndView mav = new ModelAndView("admin/editStudent");
        mav.addObject("student",studentFinder.findById(userId));
        return mav;
    }

    @GetMapping(value = "/panelAdmin/studentList/studentD/{userId}")
    public String deleteStudent(@PathVariable (value = "userId")int userId){
        studentService.deleteStudentById(userId);
        return "redirect:../panelAdmin/studentList";
    }

    @PostMapping(value = "/panelAdmin/studentList/studentE/{userId}")
    public String editStudentDetails(@PathVariable (value = "userId")int userId,
                                        @ModelAttribute("student") StudentDto studentDto){
        StudentDto student = studentFinder.findById(userId);
        studentDto.setPassword(student.getPassword());

        student = new StudentDto();

        studentService.deleteStudentById(userId);
        studentService.addNewStudent(studentDto);

        return "redirect:../panelAdmin/studentList/student/{userId}}";
    }

    @GetMapping(value = "/panelAdmin/instructorList/instructor/{userId}")
    public ModelAndView instructorDetailsPage(@PathVariable (value = "userId") int userId) {
        ModelAndView mav = new ModelAndView("admin/instructorDetails");
        mav.addObject("instructor", instructorFinder.findById(userId));
        return mav;
    }

    @GetMapping(value = "/panelAdmin/instructorList/instructorE/{userId}")
    public ModelAndView instructorEditPage(@PathVariable (value = "userId") int userId) {
        ModelAndView mav = new ModelAndView("admin/editInstructor");
        mav.addObject("instructor", instructorFinder.findById(userId));
        return mav;
    }

    @PostMapping(value = "/panelAdmin/instructorList/instructorE/{userId}")
    public String editInstructorDetails(@PathVariable (value = "userId")int userId,
                                  @ModelAttribute("instructor") InstructorDto instructorDto){

        InstructorDto instructor = instructorFinder.findById(userId);
        instructorDto.setPassword(instructor.getPassword());

        instructor = new InstructorDto();

        instructorService.deleteInstructorByid(userId);
        instructorService.addNewInst(instructor);

        return "redirect:../panelAdmin/instructorList/instructor/{userId}";
    }

    @GetMapping(value = "/panelAdmin/instructorList/instructorD/{userId}")
    public String deleteInstructor(@PathVariable (value = "userId")int userId){
        instructorService.deleteInstructorByid(userId);
        return "redirect:../panelAdmin/instructorList";
    }




}
