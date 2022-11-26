package com.bajajbikes.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bajajbikes.entities.Employee;
import com.bajajbikes.repository.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepo;

	@Override
	public void saveEmployee(Employee employee) {
		employeeRepo.save(employee);
		
	}

	@Override
	public List<Employee> listEmployee() {
		List<Employee> employees = employeeRepo.findAll();
		return employees;
	}

	@Override
	public void deleteEmployeeById(long id) {
		employeeRepo.deleteById(id);
		
	}

	@Override
	public Employee updateOneEmployee(long id) {
		Optional<Employee> findById = employeeRepo.findById(id);
		Employee employee = findById.get();
		return employee;
	}

	@Override
	public Employee getOneEmployee(long id) {
		Optional<Employee> findById = employeeRepo.findById(id);
		Employee employee = findById.get();
		return employee;
	}

}
