package com.avion.collegebatchapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CollegebatchappApplication {

	public static void main(String[] args) {
		SpringApplication.run(CollegebatchappApplication.class, args);
	}

}
