package org.jetbrains.homework_2sem.controllers;


import org.jetbrains.homework_2sem.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class AdminController {

    @Autowired
    private UsersService usersService;

    @GetMapping("/admin")
    public String getUsers(Model model) {
        model.addAttribute("usersList", usersService.getAllUsers());
        return "admin_page";
    }
}
