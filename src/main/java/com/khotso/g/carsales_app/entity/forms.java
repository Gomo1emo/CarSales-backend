package com.khotso.g.carsales_app.entity;


import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter

@Document
public class forms {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    private String carModel;

    private String additionalDetails;
}
