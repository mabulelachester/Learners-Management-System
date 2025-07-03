package com.mabulela.learners.management.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Learners Management System Application",
description = "SpringBoot Application for Learners management System ",version = "1.0",
contact = @Contact(name = "chester mabulela",email = "chestermabulela@gmail.com")))
public class LearnersManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnersManagementSystemApplication.class, args);
	}

}
