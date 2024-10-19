package com.example.elearning.controllers;

import com.example.elearning.services.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "UserController", urlPatterns = {"/users/*"})
public class UserController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String url = req.getPathInfo();

        if (url == null || url.equals("/")) {
            UserService.renderPageUserList(req, resp);
            return;
        }

        switch (url) {

            default:
                UserService.renderPageUserList(req, resp);
                break;
        }
    }
}
