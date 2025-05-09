package org.jetbrains.homework_2sem.services;

import org.jetbrains.homework_2sem.dto.UserDto;

import java.util.List;

public interface UsersService {
    List<UserDto> getAllUsers();
}
