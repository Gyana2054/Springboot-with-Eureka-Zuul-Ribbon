package com.gyanim.springboot.studentproducerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class StudentProducerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentProducerServiceApplication.class, args);
	}

}

