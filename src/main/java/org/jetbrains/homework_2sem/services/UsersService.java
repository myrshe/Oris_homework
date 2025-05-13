package org.jetbrains.homework_2sem.services;

import org.jetbrains.homework_2sem.dto.UserDto;
import org.jetbrains.homework_2sem.models.User;

import java.util.List;

public interface UsersService {
    List<UserDto> getAllUsers();
}
