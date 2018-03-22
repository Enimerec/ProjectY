package pl.sda.projectY.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import pl.sda.projectY.bo.InstructorFinder;
import pl.sda.projectY.bo.InstructorService;
import pl.sda.projectY.bo.StudentFinder;
import pl.sda.projectY.dto.InstructorDto;
import pl.sda.projectY.dto.StudentDto;
import pl.sda.projectY.entity.Instructor;

/**
 * author:
 * Mateusz
 * Marczak
 **/
@Controller
public class InstructorPageController {

    private InstructorFinder instructorFinder;
    private InstructorService instructorService;

    @PreAuthorize(value = "hasRole('INSTRUCTOR')")
    @GetMapping(value = "/panelInstructor")
    public String getInstructorPanelPage(){
        return "instructor/instructorPanel";
    }

    @GetMapping(value = "instructor/MyProfile")
    public ModelAndView myProfilePage(){
        ModelAndView mav = new ModelAndView("admin/instructorDetails");
        mav.addObject("instructor",instructorFinder.getUserDetails());
        return mav;
    }

    @GetMapping(value = "/panelInstructor/MyProfile/edit")
    public ModelAndView editMyProfilePage(){
        ModelAndView mav = new ModelAndView("instructor/editInstructor");
        mav.addObject("instructor",instructorFinder.getUserDetails());
        return mav;
    }

    @PostMapping(value = "/panelInstructor/MyProfile/edit")
    public String editInstructor(@ModelAttribute("instructor")InstructorDto instructorDto){
        int id = (instructorDto.getUserId());
        InstructorDto instructor = instructorFinder.findById(id);
        instructorDto.setPassword(instructor.getPassword());
        instructor = new InstructorDto();

        instructorService.deleteInstructorByid(id);
        instructorService.addNewInst(instructorDto);
        return "redirect:../panelInstructor/MyProfile";
    }


}
