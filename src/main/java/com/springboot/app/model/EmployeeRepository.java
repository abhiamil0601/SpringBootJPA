package com.springboot.app.model;

import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository <Employee,Integer> {

	 
}
