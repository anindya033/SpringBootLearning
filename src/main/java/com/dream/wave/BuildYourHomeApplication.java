package com.dream.wave;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

@SpringBootApplication
public class BuildYourHomeApplication implements ApplicationRunner {

	static final Logger logger = LogManager.getLogger(BuildYourHomeApplication.class.getName());
	
	public static void main(String[] args) {
		SpringApplication.run(BuildYourHomeApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		logger.info("Logging start");
	}

}
