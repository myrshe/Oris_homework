package org.jetbrains.homework_2sem.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CarForm {
    private String brand;
    private String model;
    private int year;
    private Long mileage;
    private String color;
}
