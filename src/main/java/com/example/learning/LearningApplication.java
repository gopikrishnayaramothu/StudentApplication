package com.example.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;

@SpringBootApplication
@ComponentScan({"com.example.learning.controller, com.example.learning.security, com.example.learning.service"})
@EntityScan("com.example.learning.entity")
@EnableJpaRepositories("com.example.learning.repository")
@EnableMethodSecurity(prePostEnabled = true)
public class LearningApplication {

	public static void main(String[] args) {
//		BCryptPasswordEncoder bcrypt = new BCryptPasswordEncoder();
//		System.out.println(bcrypt.encode("gopi"));
//		System.out.println(bcrypt.encode("krishna"));
		SpringApplication.run(LearningApplication.class, args);
	}

}
