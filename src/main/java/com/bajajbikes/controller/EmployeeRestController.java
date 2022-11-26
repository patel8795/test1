package com.bajajbikes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bajajbikes.entities.Employee;
import com.bajajbikes.service.EmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeRestController {
	
	@Autowired
	public EmployeeService employeeService;
	
	@GetMapping
	public List<Employee> getAllEmployees(){
		List<Employee> employees = employeeService.listEmployee();
		return employees;
	}
	
	@PostMapping
	public void saveOneEmployee(@RequestBody Employee employee) {
		employeeService.saveEmployee(employee);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteOneEmployee(@PathVariable("id") Long id) {
		employeeService.deleteEmployeeById(id);
	}
	@PutMapping
	public void updateOneEmployee(@RequestBody Employee employee) {
		employeeService.saveEmployee(employee);
	}
	@GetMapping("/emp/{id}")
	public Employee getOneEmployee(@PathVariable("id") long id) {
		Employee employee = employeeService.getOneEmployee(id);
		
		return employee;
	}
}
