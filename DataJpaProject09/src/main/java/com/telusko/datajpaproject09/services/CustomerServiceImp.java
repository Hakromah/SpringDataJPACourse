package com.telusko.datajpaproject09.services;

import com.telusko.datajpaproject09.entity.CustomerInfo;
import com.telusko.datajpaproject09.repository.ICustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImp implements ICustomerService {

    @Autowired
    private ICustomerRepo repo;

    @Override
    public String regCustomerInfo(CustomerInfo cx) {
        CustomerInfo c = repo.save(cx);
        return "Data Stored in DB Successfully with id: " + c.getId();
    }

    @Override
    public Iterable<CustomerInfo> fetchAllCx() {
        return repo.findAll();
    }


}
