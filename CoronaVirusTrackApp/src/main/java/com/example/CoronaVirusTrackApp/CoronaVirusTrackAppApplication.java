package com.example.CoronaVirusTrackApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CoronaVirusTrackAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoronaVirusTrackAppApplication.class, args);
	}

}
