package com.telusko.datajpaproject10.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
public class JobSeeker {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;
    private String city;
    private LocalDate dob;
    @Lob
    @Column(length = 100000)
    private byte[] image;
    @Lob// = large object
    private char[] textFile;

    public JobSeeker() {
        super();
    }

    public JobSeeker(String name, String city, LocalDate dob, byte[] image, char[] textFile) {
        this.name = name;
        this.city = city;
        this.dob = dob;
        this.image = image;
        this.textFile = textFile;
    }
}
