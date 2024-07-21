package com.telusko.datajpaproject07.services;

import com.telusko.datajpaproject07.repository.IVaccineRepo;
import com.telusko.datajpaproject07.view.View;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VaccineServiceImpl implements IVaccineService {

    @Autowired
    private IVaccineRepo repo;

    @Override
    public <T extends View> List<T> fetchByPriceLessThan(Double price, Class<T> cls) {
        return repo.findByPriceLessThan(price, cls);

    }
}

