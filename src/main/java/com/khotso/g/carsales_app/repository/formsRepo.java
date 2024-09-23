package com.khotso.g.carsales_app.repository;

import com.khotso.g.carsales_app.entity.forms;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface formsRepo extends MongoRepository<forms, Long> {
}
