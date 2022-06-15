package com.rkit.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoggingApplication {

	private static final Logger LOGGER = LogManager.getLogger(LoggingApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(LoggingApplication.class, args);

		for (int i = 0; i < 10000; i++) {
			LOGGER.info("Info level log message: " + i);
			LOGGER.debug("Debug level log message: " + i);
			LOGGER.error("Error level log message: " + i);
		}
	}

}
