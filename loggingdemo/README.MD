Spring boot supports logback as the default logging framework
slf4j and logback works together cohessively
Available logging levels are TRACE, DEBUG, INFO, WARN, ERROR, FATAL or OFF 
Logging levels are info(INFO), debug(DEBUG), warn(WARN), error(FATAL and ERROR) AND TRACE

there are two way to pass in logging configuration
1. properties
	logging
		config
		group.(group is a map )
		level.(level is a map )
		file.
			clean-history-on-start
			max-history
			max-size.
			name
			path
			total-size-cap.(total-size-cap is a map)
		pattern
			console
			dateformat
			file
			level
			rolling-file-name
		exception-conversion-word
		register-shutdown-hook
		
			
2. external file configuration