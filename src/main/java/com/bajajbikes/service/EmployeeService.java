package com.bajajbikes.service;

import java.util.List;

import com.bajajbikes.entities.Employee;

public interface EmployeeService {
	
	public void saveEmployee(Employee employee);

	public List<Employee> listEmployee();

	public void deleteEmployeeById(long id);

	public Employee updateOneEmployee(long id);

	public Employee getOneEmployee(long id);
	
}
