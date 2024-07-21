package com.telusko.datajpaproject08.services;

import com.telusko.datajpaproject08.entity.Vaccine;
import com.telusko.datajpaproject08.repository.IVaccineRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VaccineServiceImpl implements IVaccineService {

    @Autowired
    private IVaccineRepo repo;

    @Override
    public List<Vaccine> findVaccineCompanyName(String cp) {
        return repo.searchByVaccineCompanyName(cp);
    }

    @Override
    public List<Vaccine> findVaccineCompanyName(String comp1, String comp2) {
        return repo.searchByVaccineCompanyName(comp1, comp2);
    }

    @Override
    public List<String> findVaccinePriceRange(Double minp, Double maxp) {
        return repo.searchByVaccinePriceRange(minp, maxp);
    }

    // FOR NON SELECT OPERATIONS
    @Override
    public int updateVaccinePrice(Double newPrice, String vacName) {
        return repo.updateVaccinePriceByVaccineName(newPrice, vacName);
    }

    @Override
    public int deleteVaccinePriceRange(Double minP, Double maxP) {
        return repo.deleteVaccinePriceRange(minP, maxP);
    }

    @Override
    public int insertVaccineDetails(Integer id, Double price, String vaccineCompany, String vaccineName) {
        return repo.insertVaccineDetails(id, price, vaccineCompany, vaccineName);
    }
}

