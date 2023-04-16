package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.example.demo.repository")
@EnableAutoConfiguration
@SpringBootApplication
public class Pharmacietest2Application {

	
	public static void main(String[] args) {
		SpringApplication.run(Pharmacietest2Application.class, args);
	}

}
