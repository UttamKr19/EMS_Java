package com.xoriant.springbootapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.xoriant.springbootapp.model.Employee;
import com.xoriant.springbootapp.service.EmployeeService;



//@CrossOrigin(origins = {"https://ems-react-webapp.herokuapp.com/","http://localhost:3000/"})
@CrossOrigin
@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/test")
	public String test() {
		return "for testing purpose";
	}
	
	@GetMapping("/employees")
	public List<Employee> getEmployees() {
		return service.getEmployees();
	}
	
	@GetMapping("/employees/{id}")
	public Employee getEmployee(@PathVariable String id) {
		return service.getEmployee(Integer.parseInt(id));
	}
	
	@PostMapping("/employees")
	public void addEmployee(@RequestBody Employee employee) {
		service.addEmployee(employee);
	}
	
	@PutMapping("/employees/{id}")
	public void updateEmployee(@RequestBody Employee employee, @PathVariable String id) {
		service.updateEmployee(employee, Integer.parseInt(id));
	}
	
	@DeleteMapping("/employees/{id}")
	public void deleteEmployee(@PathVariable String id) {
		service.deleteEmployee(Integer.parseInt(id));
	}
}















