package org.jetbrains.homework_2sem.controllers;


import freemarker.template.TemplateException;
import org.jetbrains.homework_2sem.dto.UserForm;
import org.jetbrains.homework_2sem.services.SignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.io.IOException;

@Controller
public class SignUpController {
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private SignUpService signUpService;

    @GetMapping("/signUp")
    public String getSignUpPage() {
        return "sign_up_page";
    }

    @PostMapping("/signUp")
    public String signUp(@ModelAttribute UserForm userForm) throws TemplateException, IOException {
        userForm.setPassword(passwordEncoder.encode(userForm.getPassword()));
        signUpService.addUser(userForm);
        return "redirect:/signIn";
    }
}
