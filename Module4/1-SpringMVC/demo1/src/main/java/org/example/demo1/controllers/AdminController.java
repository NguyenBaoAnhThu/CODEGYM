package org.example.demo1.controllers;

import org.example.demo1.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

    private LoginService loginService;
    @Autowired
    public AdminController(LoginService loginService) {
        this.loginService = loginService;
    }
    @GetMapping("")
    public String index (){
        return "admin/index";
    }
    @GetMapping("/users/{id}")
    public String userDetails (@PathVariable("id")int id, Model model){
        model.addAttribute("userId", id);
        return "admin/users/detail";
    }
}
