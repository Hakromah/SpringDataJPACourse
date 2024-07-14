package com.telusko.datajpaproject03.services;

import com.telusko.datajpaproject03.entity.Vaccine;

import java.util.List;

public interface IVaccineService {
    //
//    //Let Register Vaccine Information to DB
//    public String registerVaccineInfo(Vaccine vaccine);
//
//    // register collection of Vaccine Information to DB
//    public Iterable<Vaccine> registerMultipleVaccines(Iterable<Vaccine> vaccineList);
//
//    public Long getCount();
//
//    public Boolean checkAvailability(Integer id);
//
//    public Iterable<Vaccine> getAllVaccines();
//
//    // method overloading(same method name but different parameters)
//    public Iterable<Vaccine> getAllVaccines(Iterable<Integer> vaccineIds);
//    public Vaccine fetchVaccineById(Integer id);
//    public String deleteVaccineById(Integer id);
//
//    public void fetchDetailsPageRecord(Integer id);
    public Iterable<Vaccine> fetchDetails(Boolean status, String... properties);

    public List<Vaccine> fetchPageDetails(int pgNo, int pgSize, Boolean status, String... properties);

    public void fetchDetailsPagination(Integer pageSize);

}
