package com.telusko.datajpaproject02.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "vaccineInfo")
public class Vaccine {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String vaccineName;

    private String vaccineCompany;

    private Double price;

    public Vaccine() {
        super();
    }


    // This Constructor is for Updating the records based on their ID
    //That is why I have added ID in this constructor
    public Vaccine(Integer id, String vaccineName, String vaccineCompany, Double price) {
        this.id = id;
        this.vaccineName = vaccineName;
        this.vaccineCompany = vaccineCompany;
        this.price = price;
    }

    public Vaccine(String vaccineName, String vaccineCompany, Double price) {
        super();
        this.vaccineName = vaccineName;
        this.vaccineCompany = vaccineCompany;
        this.price = price;
    }
}
