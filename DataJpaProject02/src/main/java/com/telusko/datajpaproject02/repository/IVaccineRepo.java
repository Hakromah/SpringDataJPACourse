package com.telusko.datajpaproject02.repository;

import com.telusko.datajpaproject02.entity.Vaccine;
import org.springframework.data.repository.CrudRepository;

public interface IVaccineRepo extends CrudRepository<Vaccine, Integer> {
}
