package com.telusko.datajpaproject05.repository;

import com.telusko.datajpaproject05.entity.Vaccine;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IVaccineRepo extends JpaRepository<Vaccine, Integer> {
    // We want to perform searching operations based our own logic

    // Always we use findBy...()//findByProperty
    public List<Vaccine> findByPrice(Double price);

    public List<Vaccine> findByVaccineName(String vaccineName);

    public List<Vaccine> findByVaccineCompany(String vaccineCompany);

    // findByPropertyKeywords
    // findByPropertyKeywordsProperty
    public List<Vaccine> findByPriceBetween(Double stPrice, Double edPrice);

    // Here we have introduced our own in builds to the repository container.
    // because the predefined methods in the repository container, doesn't have search methods.
    // And we can introduce our own methods work like predefined methods by using our Entity class
    // property/field names starting with findBy . e.g: findByName(); findByAge() ...
}
