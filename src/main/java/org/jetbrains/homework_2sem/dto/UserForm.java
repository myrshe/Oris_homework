package org.jetbrains.homework_2sem.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserForm {
    private Long id;
    private Long phone;
    private String email;
    private String password;
}
