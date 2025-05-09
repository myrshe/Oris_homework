package org.jetbrains.homework_2sem.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jetbrains.homework_2sem.models.User;

import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto {
    private Long id;
    private Long phone;
    private String email;
    private String password;

    public static UserDto from(User user) {
        return UserDto.builder()
                .id(user.getId())
                .phone(user.getPhone())
                .email(user.getEmail())
                .password(user.getPassword())
                .build();
    }

    public static List<UserDto> from(List<User> users) {
        return users.stream().map(UserDto::from).collect(Collectors.toList());
    }
}
