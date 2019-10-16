package com.fedou.kata.cloudreservation.trainreservation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
@EnableWebSecurity
public class TrainReservationApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrainReservationApplication.class, args);
	}

}
