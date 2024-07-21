package com.telusko.datajpaproject06.services;

import com.telusko.datajpaproject06.repository.IVaccineRepo;
import com.telusko.datajpaproject06.view.ResultView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VaccineServiceImpl implements IVaccineService {

    @Autowired
    private IVaccineRepo repo;

    @Override
    public List<ResultView> fetchByPriceLessThan(Double price) {
        return repo.findByPriceLessThan(price);
    }
}

