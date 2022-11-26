package com.bajajbikes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bajajbikes.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
