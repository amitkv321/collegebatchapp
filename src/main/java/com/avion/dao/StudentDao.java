package com.avion.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.avion.model.StudentDetails;

@Repository
public interface StudentDao extends CrudRepository<StudentDetails, Integer> {

}
