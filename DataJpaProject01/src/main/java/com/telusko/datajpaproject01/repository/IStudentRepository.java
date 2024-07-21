package com.telusko.datajpaproject01.repository;


import com.telusko.datajpaproject02.entity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// this is optional but recommended to use it for data access
@Repository
public interface IStudentRepository extends CrudRepository<Student, Integer> {

    // all the persistence operations are defined here by default
}
