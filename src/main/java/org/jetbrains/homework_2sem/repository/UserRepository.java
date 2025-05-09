package org.jetbrains.homework_2sem.repository;

import org.jetbrains.homework_2sem.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
