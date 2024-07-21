package com.telusko.datajpaproject09.repository;

import com.telusko.datajpaproject09.entity.CustomerInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerRepo extends CrudRepository<CustomerInfo, Integer> {


}
