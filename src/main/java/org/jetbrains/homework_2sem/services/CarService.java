package org.jetbrains.homework_2sem.services;

import org.jetbrains.homework_2sem.dto.CarDto;
import org.jetbrains.homework_2sem.dto.CarForm;

import java.util.List;

public interface CarService {
    List<CarDto> getByUser(Long id);
    CarDto addCar(CarForm carForm, Long userId);
}
