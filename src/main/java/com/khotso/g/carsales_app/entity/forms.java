package com.khotso.g.carsales_app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Setter
@Getter
@Entity
public class forms {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    private String fullNames;

    @NonNull
    private String email;

    @NonNull
    private String phone;

    @NonNull
    private String time;

    @NonNull
    private String date;

    private String additionalDetails;
}
