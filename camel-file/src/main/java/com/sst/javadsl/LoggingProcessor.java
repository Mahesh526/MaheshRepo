package com.sst.javadsl;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class LoggingProcessor implements Processor {
	private final static Logger LOGGER = Logger.getLogger(LoggingProcessor.class .getName()); 

	public void process(Exchange exchange) throws Exception {
		LOGGER.log(Level.INFO,  "**************LoggingProcessor******************** " );

		LOGGER.log(Level.INFO,  "**************LoggingProcessor******************** "+	exchange.getIn().getBody(String.class) );

	}
}