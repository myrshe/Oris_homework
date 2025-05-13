package org.jetbrains.homework_2sem.controllers;


import freemarker.template.TemplateException;
import org.jetbrains.homework_2sem.dto.CarForm;
import org.jetbrains.homework_2sem.secutity.details.UserDetailsImpl;
import org.jetbrains.homework_2sem.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.io.IOException;

@Controller
public class AddCarController {

    @Autowired
    private CarService carService;

    @GetMapping("/addCar")
    public String getAddCarPage() {
        return "add_car_page";
    }

    @PostMapping("/addCar")
    public String addCar(@ModelAttribute CarForm carForm, @AuthenticationPrincipal UserDetailsImpl userDetails) throws TemplateException, IOException {
        carService.addCar(carForm, userDetails.getUser().getId());
        return "redirect:/profile";
    }
}
