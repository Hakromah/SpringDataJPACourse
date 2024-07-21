package com.telusko.datajpaproject10.services;

import com.telusko.datajpaproject10.entity.JobSeeker;
import com.telusko.datajpaproject10.repository.IJobseekerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class JobSeekerServiceImp implements IJobSeekerService {

    @Autowired
    private IJobseekerRepo repo;

    @Override
    public String regJobSeekerInfo(JobSeeker job) {
        JobSeeker js = repo.save(job);
        return "Person saved successfully with id: " + js.getId();
    }

    @Override
    public Optional<JobSeeker> searchSingleJobSeeker(Integer id) {
        return repo.findById(id);
    }

    @Override
    public Iterable<JobSeeker> fetchAllJbSeekers() {
        return repo.findAll();
    }


}
