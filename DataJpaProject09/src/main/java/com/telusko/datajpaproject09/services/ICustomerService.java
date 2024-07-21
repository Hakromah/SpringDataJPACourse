package com.telusko.datajpaproject09.services;

import com.telusko.datajpaproject09.entity.CustomerInfo;

public interface ICustomerService {

    public String regCustomerInfo(CustomerInfo cx);

    public Iterable<CustomerInfo> fetchAllCx();
}
