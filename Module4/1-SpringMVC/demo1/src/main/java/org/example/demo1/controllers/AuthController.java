package org.example.demo1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/auth")
public class AuthController {
    @GetMapping("/login")
    public String loginForm(@RequestParam(value = "error",required = false)String error, Model model) {
        if (error != null) {
            model.addAttribute("errorMessage", "Account not found!");
        }
        return "auth/login";
    }
    @PostMapping("/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password) {
        System.out.println(username + " - " + password);
        // Kiem tra tai khoản
        if (username.equals("admin") && password.equals("1234")) {
            return "redirect:/admin";
        } else {
            return "redirect:/auth/login?error=true";
        }
    }
}
