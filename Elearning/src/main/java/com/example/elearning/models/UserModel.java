package com.example.elearning.models;

import com.example.elearning.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserModel {
    private List<User> listUsers;

    public UserModel(){
        listUsers = new ArrayList<>();
    }
    public List<User> getListUsers() {
        return listUsers;
    }
}
