package org.jetbrains.homework_2sem.services;

import org.jetbrains.homework_2sem.dto.CarDto;
import org.jetbrains.homework_2sem.models.Car;
import org.jetbrains.homework_2sem.models.User;
import org.jetbrains.homework_2sem.repository.CarRepository;
import org.jetbrains.homework_2sem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;


@Component
public class CarServiceImpl implements CarService{

    @Autowired
    private CarRepository carRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<CarDto> getByUser(Long id) {
        Optional<User> user = userRepository.findById(id);
        List<Car> carOfUser = user.get().getCars();
        return CarDto.carList(carOfUser);
    }
}
