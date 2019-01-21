package com.gyanim.springboot.studentproducerservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gyanim.springboot.studentproducerservice.model.Student;

@RestController
public class StudentProducerControler {
	
	
	@RequestMapping(value="/student", method=RequestMethod.GET)
	public Student getAllStudentDetails() {
		Student student = new Student();
		student.setRollNo(1);
		student.setName("Gyana");
		student.setAge(29);
		student.setClassName("MCA");
		
		return student;
		
	}

}
