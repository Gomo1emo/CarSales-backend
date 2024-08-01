package entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Entity
@Getter
@Setter
public class cars {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    private Long year;

    @NonNull
    private Long milage;

    @NonNull
    private String make;

    @NonNull
    private String model;

    @NonNull
    @Column(length = 5000)
    private String desc;

    @NonNull
    private String color;

    @NonNull
    private Long price;

    @NonNull
    private String image1;

    @NonNull
    private String image2;

    @NonNull
    private String image3;

    @NonNull
    private String image4;

    @NonNull
    private String image5;

    @NonNull
    private String image6;

    @NonNull
    private String body;

    @NonNull
    private String transmission;

    @NonNull
    private String fuel;

    @NonNull
    private String drive;

    @NonNull
    private String vin;
}
