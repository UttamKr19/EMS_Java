package com.xoriant.springbootapp.service;

import java.util.List;

import com.xoriant.springbootapp.model.Employee;

public interface EmployeeService {

	List<Employee> getEmployees();

	Employee getEmployee(int id);

	void addEmployee(Employee employee);

	void updateEmployee(Employee employee, int id);

	void deleteEmployee(int id);

}
