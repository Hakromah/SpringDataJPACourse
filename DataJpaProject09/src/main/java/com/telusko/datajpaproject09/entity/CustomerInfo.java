package com.telusko.datajpaproject09.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
@Entity
public class CustomerInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String cname;
    private String city;
    private LocalDateTime dob;
    private LocalDate regDate;
    private LocalTime regTime;

    public CustomerInfo() {
        super();
    }

    public CustomerInfo(String cname, String city, LocalDateTime dob, LocalDate regDate, LocalTime regTime) {
        this.cname = cname;
        this.city = city;
        this.dob = dob;
        this.regDate = regDate;
        this.regTime = regTime;
    }
}
