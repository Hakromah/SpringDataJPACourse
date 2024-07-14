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

    public Vaccine(String vaccineName, String vaccineCompany, Double price) {
        super();
        this.vaccineName = vaccineName;
        this.vaccineCompany = vaccineCompany;
        this.price = price;
    }
}
