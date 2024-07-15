package com.telusko.datajpaproject04.services;

import com.telusko.datajpaproject04.entity.Vaccine;
import com.telusko.datajpaproject04.repository.IVaccineRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VaccineServiceImpl implements IVaccineService {

    @Autowired
    private IVaccineRepo repo;

    @Override
    public List<Vaccine> searchByGivenVaccineInfo(Vaccine Obj, Boolean status, String... params) {
        Sort sort = Sort.by(status ? Sort.Direction.ASC : Sort.Direction.DESC, params);

        Example<Vaccine> example = Example.of(Obj);
        return repo.findAll(example, sort);

    }

    @Override
    public Vaccine searchVaccineById(int id) {
        return repo.getReferenceById(id);
    }

    @Override
    public List<Vaccine> searchVaccineByIds(Iterable<Integer> ids) {

        List<Vaccine> list = repo.findAllById(ids);
        return list;
    }

    @Override
    public List<Vaccine> searchVaccineByVaccine(Vaccine vaccine) {

        Example<Vaccine> example = Example.of(vaccine);
        List<Vaccine> exm = repo.findAll(example);
        return exm;
    }

    @Override
    public String removeVaccineByIds(Iterable<Integer> ids) {
        List<Vaccine> list = repo.findAllById(ids);
        if (!list.isEmpty()) {
            repo.deleteAllByIdInBatch(ids);
            return "Record deleted successfully";
        } else {
            return "Record not found";
        }
    }

    @Override
    public String removeVaccineByIdsCrud(List<Integer> ids) {
        List<Vaccine> list = repo.findAllById(ids);
        if (list.size() == ids.size()) {
            repo.deleteAllById(ids);
            return "Record deleted successfully";
        } else {
            return "Record not found";
        }
    }
}

