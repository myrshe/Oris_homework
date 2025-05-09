package org.jetbrains.homework_2sem.repository;

import org.jetbrains.homework_2sem.models.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}
