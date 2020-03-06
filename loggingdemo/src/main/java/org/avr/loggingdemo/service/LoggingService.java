package org.avr.loggingdemo.service;

import org.avr.loggingdemo.helper.LoggingHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoggingService {
	@Autowired
	private LoggingHelper helper;

	private final Logger logger = LoggerFactory.getLogger(LoggingService.class);

	public void serviceLog() {
		while (true) {
			try {
				logger.info("dummylog::" + System.currentTimeMillis());
				Thread.sleep(30000L);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
