package com.gyanim.springboot.studentconsumerservice;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClientException;

import com.gyanim.springboot.studentconsumerservice.controller.EmployeeConsumerController;
import com.gyanim.springboot.studentconsumerservice.controller.StudentConsumerController;

@SpringBootApplication
@EnableDiscoveryClient
public class StudentConsumerServiceApplication {

	public static void main(String[] args) throws RestClientException, IOException{
		ApplicationContext ctx = SpringApplication.run(StudentConsumerServiceApplication.class, args);
		
		StudentConsumerController  studentConsumerController = ctx.getBean(StudentConsumerController.class);
		System.out.println(studentConsumerController);
		studentConsumerController.getStudentDetails();
		
		EmployeeConsumerController employeeConsumerController = ctx.getBean(EmployeeConsumerController.class);
		System.out.println(employeeConsumerController);
		employeeConsumerController.getEployeeDetails();
	}
	
	@Bean
	public  StudentConsumerController  studentConsumerController()
	{
		return  new StudentConsumerController();
	}
	
	@Bean
	public  EmployeeConsumerController  employeeConsumerController()
	{
		return  new EmployeeConsumerController();
	}
	

}

