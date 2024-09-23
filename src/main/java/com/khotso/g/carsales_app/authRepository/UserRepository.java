package com.khotso.g.carsales_app.authRepository;

import com.khotso.g.carsales_app.users.User;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;


public interface UserRepository extends MongoRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
