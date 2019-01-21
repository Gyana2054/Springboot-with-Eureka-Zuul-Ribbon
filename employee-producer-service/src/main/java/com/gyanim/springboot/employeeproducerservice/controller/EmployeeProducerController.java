package com.gyanim.springboot.employeeproducerservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gyanim.springboot.employeeproducerservice.model.Employee;

@RestController
public class EmployeeProducerController {
	
	
	@RequestMapping(value="/employee", method=RequestMethod.GET)
	public Employee getAllEmployeeDetails() {
		Employee employee = new Employee();
		
		employee.setId(520);
		employee.setName("Srinibash");
		employee.setDesignation("Software Engineer");
		employee.setSalary(50000);
		
		return employee;
		
	}

}
