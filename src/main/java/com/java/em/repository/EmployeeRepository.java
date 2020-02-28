package com.java.em.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.java.em.model.EmployeeEntity;

@Repository
public interface EmployeeRepository 
			extends CrudRepository<EmployeeEntity, Long> {

}
