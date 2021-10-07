package com.xoriant.springbootapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xoriant.springbootapp.dao.EmployeeDao;
import com.xoriant.springbootapp.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeDao dao;
	
	@Override
	public List<Employee> getEmployees() {
		return dao.findAll();
	}


	@Override
	public Employee getEmployee(int id) {
		return dao.findById(id).get();
	}


	@Override
	public void addEmployee(Employee employee) {
		dao.save(employee);
	}


	@Override
	public void updateEmployee(Employee employee, int id) {
		dao.save(employee);
	}


	@Override
	public void deleteEmployee(int id) {
		dao.delete(getEmployee(id));
	}

}





