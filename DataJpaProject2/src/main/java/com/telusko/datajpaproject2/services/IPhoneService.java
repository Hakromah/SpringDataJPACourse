package com.telusko.datajpaproject2.services;

import com.telusko.datajpaproject2.entity.Phone;

public interface IPhoneService {

    public String registerPhoneInfo(Phone phone);
    public Iterable<Phone> registerAllPhoneInfo(Iterable<Phone> phoneList);
    public Long getCount();// total
    public Boolean checkAvailability(Integer id);
    public Iterable<Phone> getAllPhones(); //All
    public Iterable<Phone> getAllPhones(Iterable<Integer> phoneIds);// specific phones

}
