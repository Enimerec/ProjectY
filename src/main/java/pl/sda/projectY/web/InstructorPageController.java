package pl.sda.projectY.web;

import org.springframework.context.annotation.Role;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * author:
 * Mateusz
 * Marczak
 **/
public class InstructorPageController {

    @Role(value = "Role_Admin")
    @GetMapping(value ="panellnstructor")
    public String instPage(){
        return "panelInstructor";
    }
}
