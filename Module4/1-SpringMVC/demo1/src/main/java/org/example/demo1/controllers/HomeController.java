package org.example.demo1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {
    //xu ly request method là GET với url /home
    @GetMapping
    public String home(Model model) {
        // truỳen model dư lieu gui sang Views
        model.addAttribute("message","Hello");
        return "home";
    }
}
