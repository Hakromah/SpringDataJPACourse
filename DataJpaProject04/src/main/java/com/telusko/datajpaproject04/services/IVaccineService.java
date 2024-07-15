package com.telusko.datajpaproject04.services;

import com.telusko.datajpaproject04.entity.Vaccine;

import java.util.List;

public interface IVaccineService {

    public List<Vaccine> searchByGivenVaccineInfo(Vaccine Obj, Boolean status, String... params);

    public Vaccine searchVaccineById(int id);

    public List<Vaccine> searchVaccineByIds(Iterable<Integer> ids);

    public List<Vaccine> searchVaccineByVaccine(Vaccine vaccine);// same method but using crud repository

    // these are custom methods in order to get return type so, we print a string message
    // because by default all delete methods in crud repository return type is void

    public String removeVaccineByIds(Iterable<Integer> ids);
    public String removeVaccineByIdsCrud(List<Integer> ids);

}
