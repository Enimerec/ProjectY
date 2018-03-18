package pl.sda.projectY.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.sda.projectY.entity.Student;
import pl.sda.projectY.entity.User;

@Controller
public class MainPageController {

    @GetMapping(value = "/main")
    public String mainPage() {
        return "main";
    }

}