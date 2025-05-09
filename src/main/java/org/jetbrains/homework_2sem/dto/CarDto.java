package org.jetbrains.homework_2sem.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jetbrains.homework_2sem.models.Car;

import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CarDto {
    private Long id;
    private String brand;
    private String model;
    private int year;
    private Long mileage;
    private String color;


    public static CarDto from(Car car) {
        return CarDto.builder()
                .id(car.getId())
                .brand(car.getBrand())
                .model(car.getModel())
                .year(car.getYear())
                .mileage(car.getMileage())
                .color(car.getColor())
                .build();
    }

    public static List<CarDto> carList(List<Car> cars) {
        return cars.stream()
                .map(CarDto::from)
                .collect(Collectors.toList());
    }
}
