package com.greatlearning.employeeManager.EmployeeManager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/*
 * @SpringBootApplication(scanBasePackages = {"com.greatLearning.employeeService","com.greatLearning.employeeService.controller","com.greatLearning.employeeService.entity","com.greatLearning.employeeService.dao","com.greatLearning.employeeService.security","com.greatLearning.employeeService.service"})
 */
@SpringBootApplication(scanBasePackages = {"com.greatlearning.employeeManager.EmployeeManager"})
public class EmployeeManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagerApplication.class, args);
	}

}
