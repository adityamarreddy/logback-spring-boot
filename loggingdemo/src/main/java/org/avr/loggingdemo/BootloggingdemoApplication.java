package org.avr.loggingdemo;

import org.avr.loggingdemo.service.LoggingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootloggingdemoApplication implements CommandLineRunner{
	@Autowired
	private LoggingService service;

	public static void main(String[] args) {
		SpringApplication.run(BootloggingdemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		service.serviceLog();
	}

}
