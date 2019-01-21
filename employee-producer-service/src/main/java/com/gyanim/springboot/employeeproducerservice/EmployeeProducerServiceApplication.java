package com.gyanim.springboot.employeeproducerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EmployeeProducerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeProducerServiceApplication.class, args);
	}

}

