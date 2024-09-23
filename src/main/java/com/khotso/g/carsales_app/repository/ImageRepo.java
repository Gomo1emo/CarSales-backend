package com.khotso.g.carsales_app.repository;

import com.khotso.g.carsales_app.entity.Image;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ImageRepo extends MongoRepository<Image, Integer> {
    List<Image> findByOrderById();
}
