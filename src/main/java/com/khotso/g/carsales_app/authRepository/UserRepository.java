package com.khotso.g.carsales_app.authRepository;

import com.khotso.g.carsales_app.users.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
