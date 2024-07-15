package com.telusko.datajpaproject05.services;

import com.telusko.datajpaproject05.entity.Vaccine;

import java.util.List;

public interface IVaccineService {

    public List<Vaccine> fetchByPrice(Double price);

    public List<Vaccine> fetchByVaccineName(String vaccineName);

    public List<Vaccine> fetchByVaccineCompany(String vaccineCompany);

    public List<Vaccine> fetchByPriceBetween(Double stPrice, Double edPrice);

}
