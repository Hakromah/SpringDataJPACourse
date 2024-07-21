package com.telusko.datajpaproject08.services;

import com.telusko.datajpaproject08.entity.Vaccine;

import java.util.List;

public interface IVaccineService {

    public List<Vaccine> findVaccineCompanyName(String cp);

    public List<Vaccine> findVaccineCompanyName(String comp1, String comp2);

    public List<String> findVaccinePriceRange(Double minp, Double maxp);

    // FOR NON SELECT OPERATIONS
    public int updateVaccinePrice(Double newPrice, String vacName);

    public int deleteVaccinePriceRange(Double minP, Double maxP);

    public int insertVaccineDetails(Integer id, Double price, String vaccineCompany, String vaccineName);
}
