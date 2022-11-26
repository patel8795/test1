package com.bajajbikes.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bajajbikes.dto.EmployeeData;
import com.bajajbikes.entities.Employee;
import com.bajajbikes.service.EmailServices;
import com.bajajbikes.service.EmployeeService;


@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService saveEmp;
	
	@Autowired
	private EmailServices emailserv;

	@RequestMapping("/createEmployee")
	public String vtewsOneEmployeePage() {
		
		return "create_employee";
	}
	
	@RequestMapping("/saveEmployee")
	public String saveOneEmployee(@ModelAttribute("employee") Employee employee, ModelMap model) {
		saveEmp.saveEmployee(employee);
		
		emailserv.sendMailWithAttachment("skpshravan787@gmail.com", "this is the email send", "java developer", 
																"C:\\Users\\SKP\\Downloads\\link shravan1");
			
		 
		model.addAttribute("msg", "Employee data is save!!");
		return "create_employee";
		
	}
	@RequestMapping("/listall")
	public String listAllOneEmployee(ModelMap model) {
		List<Employee> employees = saveEmp.listEmployee();
		model.addAttribute("employees", employees);
		return "employee_search_result";
	}
	@RequestMapping("/delete")
	public String deleteOneEmployee(@RequestParam("id") long id, ModelMap model) {
		
		saveEmp.deleteEmployeeById(id);
		List<Employee> employees = saveEmp.listEmployee();
		model.addAttribute("employees", employees);
		return "employee_search_result";
	}
	@RequestMapping("/update")
	public String updateOneEmployee(@RequestParam("id") long id, ModelMap model) {
		Employee Employee = saveEmp.updateOneEmployee(id);
		model.addAttribute("employee", Employee);
		return "update_employee";
	}
	@RequestMapping("/updateEmployee")
	public String updateOneEmployeeData(EmployeeData data, ModelMap model) {
		Employee employee = new Employee();
		employee.setId(data.getId());
		employee.setDob(data.getDob());
		employee.setFirstName(data.getFirstName());
		employee.setLastName(data.getLastName());
		employee.setEmail(data.getEmail());
		employee.setMobile(data.getMobile());
		saveEmp.saveEmployee(employee);
		List<Employee> employees = saveEmp.listEmployee();
		model.addAttribute("employees", employees);
		return "employee_search_result";
	}
}
