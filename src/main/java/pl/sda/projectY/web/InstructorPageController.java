package pl.sda.projectY.web;

import org.springframework.context.annotation.Role;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import pl.sda.projectY.dto.AdminDto;

/**
 * author:
 * Mateusz
 * Marczak
 **/
public class InstructorPageController {

    @PreAuthorize(value = "hasRole('INSTRUCTOR')")
    @GetMapping(value = "/panelInstructor")
    public String adminPage(){
        return "panelInstructor";
    }


}
