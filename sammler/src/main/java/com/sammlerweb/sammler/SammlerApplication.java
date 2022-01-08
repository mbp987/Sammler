package com.sammlerweb.sammler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SammlerApplication {

	private static final Logger LOGGER=LoggerFactory.getLogger(SammlerApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(SammlerApplication.class, args);
		
		LOGGER.info("Log from main");
	}

}
