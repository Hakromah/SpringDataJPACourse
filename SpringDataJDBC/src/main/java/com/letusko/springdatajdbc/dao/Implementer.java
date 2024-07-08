package com.letusko.springdatajdbc.dao;

import lombok.Data;

@Data
public class Implementer {
    private Integer id;
    private String name;
    private String city;


    public Implementer() {
    	super();
    }

    public Implementer(Integer id, String name, String city
    ) {
    	super();
        this.id = id;
        this.name = name;
        this.city = city;
    }

	@Override
    public String toString() {
        return "Implementer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
