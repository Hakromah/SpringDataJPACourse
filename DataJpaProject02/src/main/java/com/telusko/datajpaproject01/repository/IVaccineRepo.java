package com.telusko.datajpaproject01.repository;

import com.telusko.datajpaproject01.entity.Vaccine;
import org.springframework.data.repository.CrudRepository;

public interface IVaccineRepo extends CrudRepository<Vaccine, Integer> {
}
