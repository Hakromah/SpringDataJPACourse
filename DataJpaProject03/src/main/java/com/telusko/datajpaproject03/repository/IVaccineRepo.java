package com.telusko.datajpaproject03.repository;

import com.telusko.datajpaproject03.entity.Vaccine;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IVaccineRepo extends PagingAndSortingRepository<Vaccine, Integer> {
    long count();
}
