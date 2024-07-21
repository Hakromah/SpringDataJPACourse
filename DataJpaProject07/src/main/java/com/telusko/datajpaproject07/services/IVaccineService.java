package com.telusko.datajpaproject07.services;

import com.telusko.datajpaproject07.view.View;

import java.util.List;

public interface IVaccineService {

    public <T extends View> List<T> fetchByPriceLessThan(Double price, Class<T> cls);

}
