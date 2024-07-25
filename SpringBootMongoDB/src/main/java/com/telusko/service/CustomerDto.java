package com.telusko.service;

import lombok.Data;

@Data
public class CustomerDto {

    //private Integer id;
    private Integer cxNo;
    private String name;
    private String city;

    public CustomerDto() {
        super();
    }

    public CustomerDto(Integer cxNo, String name, String city) {
        this.cxNo = cxNo;
        this.name = name;
        this.city = city;
    }
}
