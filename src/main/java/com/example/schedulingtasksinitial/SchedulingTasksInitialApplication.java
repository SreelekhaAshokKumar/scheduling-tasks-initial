package com.example.schedulingtasksinitial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SchedulingTasksInitialApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchedulingTasksInitialApplication.class, args);
	}

}
