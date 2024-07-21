package com.telusko.datajpaproject06.repository;

import com.telusko.datajpaproject06.entity.Vaccine;
import com.telusko.datajpaproject06.view.ResultView;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IVaccineRepo extends JpaRepository<Vaccine, Integer> {

    //findBy-propertyName-keyword
    public List<ResultView> findByPriceLessThan(Double price);
}
