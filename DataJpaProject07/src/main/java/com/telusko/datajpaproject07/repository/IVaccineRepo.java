package com.telusko.datajpaproject07.repository;

import com.telusko.datajpaproject07.entity.Vaccine;
import com.telusko.datajpaproject07.view.View;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IVaccineRepo extends JpaRepository<Vaccine, Integer> {

    public <T extends View> List<T> findByPriceLessThan(Double price, Class<T> cls);

    public <T extends View> List<T> findByVaccineName(String vaccineName, Class<T> cls);

    public <T extends View> List<T> findByVaccineCompany(String vaccineCompany, Class<T> cls);

}
