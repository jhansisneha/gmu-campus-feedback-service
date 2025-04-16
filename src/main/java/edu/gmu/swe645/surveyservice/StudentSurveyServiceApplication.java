package edu.gmu.swe645.surveyservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Entry point for the Spring Boot microservice application
@SpringBootApplication
public class StudentSurveyServiceApplication {

	public static void main(String[] args) {
		// Boots up the application and initializes all Spring components
		SpringApplication.run(StudentSurveyServiceApplication.class, args);
	}

}
