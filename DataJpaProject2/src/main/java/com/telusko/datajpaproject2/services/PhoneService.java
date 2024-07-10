package com.telusko.datajpaproject2.services;

import com.telusko.datajpaproject2.entity.Phone;
import com.telusko.datajpaproject2.repository.IPhoneRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhoneService implements IPhoneService {

    @Autowired
    private IPhoneRepo repo;

    @Override
    public String registerPhoneInfo(Phone phone) {
        Phone ph = repo.save(phone);
        Integer id = ph.getId();
        if (ph != null) {
            return "Phone with Id " + id + " saved successfully";
        } else {
            return "Phone registration Failed";
        }
    }

    @Override
    public Iterable<Phone> registerAllPhoneInfo(Iterable<Phone> phoneList) {
        return repo.saveAll(phoneList);
    }

    @Override
    public Long getCount() {
        return repo.count();
    }

    @Override
    public Boolean checkAvailability(Integer id) {
        return repo.existsById(id);
    }

    @Override
    public Iterable<Phone> getAllPhones() {
        return repo.findAll();
    }

    @Override
    public Iterable<Phone> getAllPhones(Iterable<Integer> phoneIds) {
        return repo.findAllById(phoneIds);
    }
}
