package com.xoriant.springbootapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.xoriant.springbootapp.model.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer>{
	
}
