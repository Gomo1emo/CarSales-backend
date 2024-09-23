package com.khotso.g.carsales_app.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Image {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

//    @Column(length = 1000)
    private String name;

//    @Column(length = 1000)
    private String imageUrl;

//    @Column(length = 1000)
    private String imageId;

    public Image(String name, String imageUrl, String imageId) {
        this.name = name;
        this.imageUrl = imageUrl;
        this.imageId = imageId;
    }
}
