package com.telusko.datajpaproject03.services;

import com.telusko.datajpaproject03.entity.Vaccine;
import com.telusko.datajpaproject03.repository.IVaccineRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VaccineServiceImpl implements IVaccineService {

    @Autowired
    private IVaccineRepo repo;

    @Override
    public Iterable<Vaccine> fetchDetails(Boolean status, String... properties) {
        Sort sort = Sort.by(status ? Sort.Direction.ASC : Sort.Direction.DESC, properties);
        return repo.findAll(sort);
    }

    @Override
    public List<Vaccine> fetchPageDetails(int pgNo, int pgSize, Boolean status, String... properties) {

//        Sort sort = Sort.by(status ? Sort.Direction.ASC : Sort.Direction.DESC, properties);
//        PageRequest page1 = PageRequest.of(pgNo, pgSize, sort);
//        Page<Vaccine> pageData1 = repo.findAll(page1);

        PageRequest page = PageRequest.of(pgNo, pgSize, status ? Sort.Direction.ASC : Sort.Direction.DESC, properties);
        Page<Vaccine> pageData = repo.findAll(page);

        return pageData.getContent();
    }

    @Override// we make this method void because I will print it in this Service class
    public void fetchDetailsPagination(Integer pageSize) {
        long count = repo.count();
        //long count = 21L;
        long pagesCount = count / pageSize;// 21/5 = 4.2 -> this will give 4 pages and 1 extra page will be ignored
        //to avoid that we use mod
        // 21 % 5 = 1 -> 4 pages and 1 extra page will be added
        pagesCount = (count % pageSize) == 0 ? pagesCount : ++pagesCount;

        for (int i = 0; i < pagesCount; i++) {
            PageRequest pageable = PageRequest.of(i, pageSize);
            Page<Vaccine> page = repo.findAll(pageable);
            System.out.println("Page Number -> " + i);
            page.getContent().forEach(System.out::println);
        }
    }
}
