package com.telusko.datajpaproject10.repository;

import com.telusko.datajpaproject10.entity.JobSeeker;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IJobseekerRepo extends CrudRepository<JobSeeker, Integer> {

}
