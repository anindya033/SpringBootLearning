package com.dream.wave;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

@SpringBootApplication
public class BuildYourHomeApplication {

	//static final Logger logger = LogManager.getLogger(BuildYourHomeApplication.class.getName());
	
	public static void main(String[] args) {
		SpringApplication.run(BuildYourHomeApplication.class, args);
		DOMConfigurator.configure("log4j.xml");
		//logger.info("Log4j appender configuration is successful !!");
	}

//	@Override
//	public void run(ApplicationArguments args) throws Exception {
//		// TODO Auto-generated method stub
//		logger.info("Logging start");
//	}

}
