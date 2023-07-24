package com.junit5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Junit5RestApiTestingApplication {

	public static void main(String[] args) {
		SpringApplication.run(Junit5RestApiTestingApplication.class, args);
		System.out.println("Application Started....");
	}

}
