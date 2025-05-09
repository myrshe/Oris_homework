package org.jetbrains.homework_2sem.services;

import org.jetbrains.homework_2sem.dto.UserDto;
import org.jetbrains.homework_2sem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UsersServiceImpl implements UsersService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UserDto> getAllUsers() {
        return UserDto.from(userRepository.findAll());
    }
}
