package pl.sda.projectY.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import pl.sda.projectY.bo.StudentFinder;
import pl.sda.projectY.bo.StudentService;
import pl.sda.projectY.dto.StudentDto;

/**
 * author:
 * Mateusz
 * Marczak
 **/

@Controller
public class StudentPageController {

    private StudentFinder studentFinder;
    private StudentService studentService;

    @Autowired
    public StudentPageController(StudentFinder studentFinder, StudentService studentService) {
        this.studentFinder = studentFinder;
        this.studentService = studentService;
    }

    @PreAuthorize(value = "hasRole('ROLE_STUDENT')")
    @RequestMapping(value = "/panelStudent", method = {RequestMethod.GET, RequestMethod.POST})
    public String getStudentPanelPage(){
        return "student/studentPanel";
    }

    @GetMapping(value = "/studentPanel/MyProfile")
    public ModelAndView myProfilePage(){
        ModelAndView mav = new ModelAndView("admin/studentDetails");
        mav.addObject("student",studentFinder.getUserDetails());
        return mav;
    }

    @GetMapping(value = "/panelStudent/MyProfile/edit")
    public ModelAndView editMyProfilePage(){
        ModelAndView mav = new ModelAndView("student/editStudent");
        mav.addObject("student",studentFinder.getUserDetails());
        return mav;
    }

    @PostMapping(value = "/panelStudent/MyProfile/edit")
    public String editStudent(@ModelAttribute("newStudent") StudentDto studentDto){
        int id = (studentDto.getUserId());
        StudentDto student = studentFinder.findById(id);
        studentDto.setPassword(student.getPassword());
        student = new StudentDto();

        studentService.deleteStudentById(id);
        studentService.addNewStudent(studentDto);
        return "redirect:../studentPanel/MyProfile";
    }


}
