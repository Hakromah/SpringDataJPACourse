package com.telusko.datajpaproject04.repository;

import com.telusko.datajpaproject04.entity.Vaccine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IVaccineRepo extends JpaRepository<Vaccine, Integer> {
    // JpaRepository has all the methods of CrudRepository and PagingAndSortingRepository
    // we can use them directly in this JpaRepository interface
}
