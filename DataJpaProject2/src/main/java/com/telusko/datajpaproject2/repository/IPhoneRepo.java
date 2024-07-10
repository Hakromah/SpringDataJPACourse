package com.telusko.datajpaproject2.repository;

import com.telusko.datajpaproject2.entity.Phone;
import org.springframework.data.repository.CrudRepository;

public interface IPhoneRepo extends CrudRepository<Phone, Integer> {
}
