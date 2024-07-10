package com.telusko.datajpaproject2.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "phoneInfo")
public class Phone {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String phoneName;
    private String phoneCompany;
    private Double price;

    public Phone() {
        super();
    }

    public Phone(String phoneName, Double price, String phoneCompany) {
        this.phoneName = phoneName;
        this.phoneCompany=phoneCompany;
        this.price = price;
    }
}
