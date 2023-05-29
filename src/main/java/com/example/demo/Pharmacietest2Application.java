package com.example.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


//@SpringBootApplication @EnableAutoConfiguration(exclude={UserDetailsServiceAutoConfiguration.class})
//@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
//@SpringBootApplication(exclude= {UserDetailsServiceAutoConfiguration.class})



@SpringBootApplication
public class Pharmacietest2Application {

	
	public static void main(String[] args) {
		SpringApplication.run(Pharmacietest2Application.class, args);
	}

}
