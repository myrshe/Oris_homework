package org.jetbrains.homework_2sem.services;

import org.jetbrains.homework_2sem.dto.UserForm;
import org.jetbrains.homework_2sem.models.Role;
import org.jetbrains.homework_2sem.models.User;
import org.jetbrains.homework_2sem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component
public class SignUpServiceImpl implements SignUpService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public void addUser(UserForm userForm) {
        System.out.println("Получены данные: " + userForm);
        User user = User.builder()
                .email(userForm.getEmail())
                .phone(userForm.getPhone())
                .password((userForm.getPassword()))
                .role(Role.USER)
                .build();

        userRepository.save(user);
        System.out.println("1");
    }
}
