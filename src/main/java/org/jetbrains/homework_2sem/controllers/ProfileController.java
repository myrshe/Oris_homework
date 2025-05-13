package org.jetbrains.homework_2sem.controllers;


import org.jetbrains.homework_2sem.dto.UserDto;
import org.jetbrains.homework_2sem.services.UsersService;
import org.springframework.ui.Model;
import org.jetbrains.homework_2sem.dto.CarDto;
import org.jetbrains.homework_2sem.secutity.details.UserDetailsImpl;
import org.jetbrains.homework_2sem.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProfileController {

    @Autowired
    private UsersService usersService;

    @Autowired
    private CarService carService;


    @GetMapping("/profile")
    public String getProfilePage(Model model, @AuthenticationPrincipal UserDetailsImpl userDetails) {

        String userRole = userDetails.getAuthorities().iterator().next().getAuthority();
        List<CarDto> userCars = carService.getByUser(userDetails.getUser().getId());

        UserDto user = UserDto.from(userDetails.getUser());

        model.addAttribute("user", user);
        model.addAttribute("userRole", userRole);
        model.addAttribute("cars", userCars);

        return "profile_page";
    }
}
