package com.khotso.g.carsales_app.entity;

import jakarta.annotation.Nullable;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
@Getter
@Setter
public class cars {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @NonNull
    private Long year;

    @NonNull
    private Long millage;

    @NonNull
    private String make;

    @NonNull
    private String model;

    @NonNull
//    @Column(length = 5000)
    private String description;

    @NonNull
    private String color;

    @NonNull
    private Long price;

    @Nullable
    private String image1;

    @Nullable
    private String image2;

    @Nullable
    private String image3;

    @Nullable
    private String image4;

    @Nullable
    private String image5;

    @Nullable
    private String image6;

    @NonNull
    private String body;

    @NonNull
    private String transmission;

    @NonNull
    private String fuel;

    @NonNull
    private String tankSize;

    @NonNull
    private String drive;

    @NonNull
    private String vin;
}
