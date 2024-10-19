package com.example.elearning.services;

import com.example.elearning.models.UserModel;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserService {
    private UserModel userModel;

    public UserService() {
        userModel = new UserModel();
    }


    public static void renderPageUserList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/views/user/list.jsp");
        requestDispatcher.forward(request, response);
    }
}
