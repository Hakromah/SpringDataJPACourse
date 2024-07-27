package com.telusko.service;

import com.telusko.entity.Customer;

public interface ICustomerService {

    public String registerCustomerInfo(CustomerDto dto);
    public Iterable<Customer> fetchAllCustomers();
    public String deleteDocument(String id);
}
