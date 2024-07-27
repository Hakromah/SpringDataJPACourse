package com.telusko.entity;


import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Customer {

    @Id
    private String id;

    private Integer cxNo;
    private String name;
    private String city;

    public Customer() {
        super();
    }

    public Customer(String id, Integer cxNo, String name, String city) {
        this.id = id;
        this.cxNo = cxNo;
        this.name = name;
        this.city = city;
    }
}
