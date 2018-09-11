package com.telkom.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SaveVettingProcessor implements Processor{

	Logger logger = LoggerFactory.getLogger(SaveVettingProcessor.class);
	
	@Override
	public void process(Exchange exchange) throws Exception {
		logger.info("===== Inside save Vetting Processor =====");
		exchange.getOut().setBody("{}");
		
	}

}
