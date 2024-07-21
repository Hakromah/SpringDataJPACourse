package com.telusko.datajpaproject06.services;

import com.telusko.datajpaproject06.view.ResultView;

import java.util.List;

public interface IVaccineService {

    public List<ResultView> fetchByPriceLessThan(Double price);

}
