package org.example.demo1.request;

import org.springframework.web.multipart.MultipartFile;

public class UserRequest {
    private String name;
    private String email;
    private String password;
    private MultipartFile avatar;

    // Constructor mặc định (bắt buộc cho Spring)
    public UserRequest() {
    }

    public UserRequest(String name, String email, String password, MultipartFile avatar) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.avatar = avatar;
    }

    // Getters và setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public MultipartFile getAvatar() {
        return avatar;
    }

    public void setAvatar(MultipartFile avatar) {
        this.avatar = avatar;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
