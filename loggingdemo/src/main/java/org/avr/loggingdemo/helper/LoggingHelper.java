package org.avr.loggingdemo.helper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class LoggingHelper {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	
	
	public void helperLog() {
		logger.info("helper info message");
		logger.debug("helper debug message");
		logger.error("helper error message");
		logger.warn("helper warn message");
		logger.trace("helper trace message");
		throw new RuntimeException();
	}
}
