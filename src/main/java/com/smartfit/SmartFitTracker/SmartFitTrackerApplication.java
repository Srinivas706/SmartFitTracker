package com.smartfit.SmartFitTracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.smartfit.SmartFitTracker.controller", "com.smartfit.SmartFitTracker.repository", "com.smartfit.SmartFitTracker.model", "com.smartfit.SmartFitTracker"})
public class SmartFitTrackerApplication {
	public static void main(String[] args) {
		SpringApplication.run(SmartFitTrackerApplication.class, args);
		//SpringApplication app = new SpringApplication(SmartFitTrackerApplication.class);
		//app.setAdditionalProfiles("cli");
		//app.run(args);
	}
}
