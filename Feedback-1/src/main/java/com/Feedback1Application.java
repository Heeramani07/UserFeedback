package com;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@ComponentScan(basePackages="com")

@EntityScan(basePackages="com")
@EnableJpaRepositories(basePackages="com")

@SpringBootApplication
public class Feedback1Application {

	public static void main(String[] args) {
		SpringApplication.run(Feedback1Application.class, args);
	}

}