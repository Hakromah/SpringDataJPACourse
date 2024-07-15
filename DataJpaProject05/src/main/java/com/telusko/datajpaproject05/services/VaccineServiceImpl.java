package com.telusko.datajpaproject05.services;

import com.telusko.datajpaproject05.entity.Vaccine;
import com.telusko.datajpaproject05.repository.IVaccineRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VaccineServiceImpl implements IVaccineService {

    @Autowired
    private IVaccineRepo repo;

    @Override
    public List<Vaccine> fetchByPrice(Double price) {
        return repo.findByPrice(price);
    }

    @Override
    public List<Vaccine> fetchByVaccineName(String vaccineName) {
        return repo.findByVaccineName(vaccineName);
    }

    @Override
    public List<Vaccine> fetchByVaccineCompany(String vaccineCompany) {
        return repo.findByVaccineCompany(vaccineCompany);
    }

    @Override
    public List<Vaccine> fetchByPriceBetween(Double stPrice, Double edPrice) {
        return repo.findByPriceBetween(stPrice, edPrice);
    }
}

