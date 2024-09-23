package com.khotso.g.carsales_app.repository;

import com.khotso.g.carsales_app.entity.cars;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface carRepo extends MongoRepository<cars, Long> {
}
