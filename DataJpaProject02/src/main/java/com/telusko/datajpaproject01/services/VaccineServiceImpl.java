package com.telusko.datajpaproject01.services;

import com.telusko.datajpaproject01.entity.Vaccine;
import com.telusko.datajpaproject01.repository.IVaccineRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VaccineServiceImpl implements IVaccineService {

    @Autowired
    private IVaccineRepo repo;

    @Override
    public String registerVaccineInfo(Vaccine vaccine) {
        Vaccine vdb = repo.save(vaccine);
        Integer id = vdb.getId();
        if (vdb != null) {
            return "Vaccine Info with Id: " + id + " Registered Successfully";
        } else {
            return "Vaccine Info Registration Failed";
        }
    }

    @Override
    public Iterable<Vaccine> registerMultipleVaccines(Iterable<Vaccine> vaccineList) {
        // save multiple vaccines

        //Iterable<Vaccine> vaccineList = Arrays.asList(vaccine1, vaccine2, vaccine3, vaccine4, vaccine5);
        return repo.saveAll(vaccineList);

    }

    @Override
    public Long getCount() {
        return repo.count();
    }

    @Override
    public Boolean checkAvailability(Integer id) {
        return repo.existsById(id);
    }

    @Override
    public Iterable<Vaccine> getAllVaccines() {
        return repo.findAll();
    }

    @Override
    public Iterable<Vaccine> getAllVaccines(Iterable<Integer>  vaccineIds) {
        return repo.findAllById(vaccineIds);
    }
}
