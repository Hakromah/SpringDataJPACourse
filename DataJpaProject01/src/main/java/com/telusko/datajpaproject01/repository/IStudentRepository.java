package com.telusko.datajpaproject01.repository;

import com.telusko.datajpaproject01.entity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository// this is optional but recommended to use it for data access
public interface IStudentRepository extends CrudRepository<Student, Integer> {

    // all the persistence operations are defined here by default
}
