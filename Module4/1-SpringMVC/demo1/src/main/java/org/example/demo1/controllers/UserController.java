package org.example.demo1.controllers;

import org.example.demo1.entities.User;
import org.example.demo1.request.UserRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {
    public List<User> listUser;
    public UserController(){
        // tạo danh sách user
        listUser = new ArrayList<User>();
        listUser.add(new User(1, "User 1"));
        listUser.add(new User(2, "User 2"));
        listUser.add(new User(3, "User 3"));
        listUser.add(new User(4, "User 4"));
    }
    @GetMapping("")
    public String listUsers(Model model){
        model.addAttribute("listUser", listUser);  // truyền danh sách user vào model để hiển thị trên Views
        // xử lý request method Get với url;/users
        return "users/list";
    }
    @GetMapping("/{id}/delete")
    public String deleteUser(@PathVariable int id, Model model){
        listUser.removeIf(user -> user.getId() == id);
        return "redirect:/users";
    }
    @GetMapping("/add")
    public String createUserForm(Model model) {
        model.addAttribute("userRequest", new UserRequest()); // Đảm bảo tạo mới UserRequest
        return "users/add";
    }
    @PostMapping("/add")
    public String saveUser(@ModelAttribute("userRequest") UserRequest userRequest, BindingResult result) {
        // Kiểm tra giá trị đầu vào
        System.out.println("User name: " + userRequest.getName());
        System.out.println("Email: " + userRequest.getEmail());
        System.out.println("Password: " + userRequest.getPassword());

        // Lấy file avatar từ UserRequest
        MultipartFile avatar = userRequest.getAvatar();
        if (avatar != null && !avatar.isEmpty()) {
            String filename = avatar.getOriginalFilename();
            System.out.println("File name: " + filename);
            // Xử lý file tại đây
        } else {
            System.out.println("No file uploaded or file is empty.");
        }

        return "redirect:/users"; // Chuyển hướng sau khi xử lý xong
    }
}
