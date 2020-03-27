package com.one.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeTrackerWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeTrackerWebApplication.class, args);
		System.out.println("Welcome to employee tracker system");
	}

}
