package com.telusko.datajpaproject10.services;

import com.telusko.datajpaproject10.entity.JobSeeker;

import java.util.Optional;

public interface IJobSeekerService {

    public String regJobSeekerInfo(JobSeeker job);

    public Optional<JobSeeker> searchSingleJobSeeker(Integer id);

    public Iterable<JobSeeker> fetchAllJbSeekers();
}
