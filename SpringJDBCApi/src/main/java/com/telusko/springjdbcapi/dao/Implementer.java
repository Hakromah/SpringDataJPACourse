package com.telusko.springjdbcapi.dao;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

//@Data// from lombok
@Setter
@Getter
public class Implementer {
    private Integer id;
    private String name;
    private String city;
    public Integer getId;

    public Implementer() {
        System.out.println("Implementer Constructor created");
    }

    public Implementer(Integer id, String name, String city, Integer getId) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.getId = getId;
    }

    @Override
    public String toString() {
        return "Implementer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", getId=" + getId +
                '}';
    }
}
