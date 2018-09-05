package com.telkom.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AVSResponseProcessor implements Processor{

	

	@Override
	public void process(Exchange exchange) throws Exception {
		// TODO Auto-generated method stub
        
		Logger log = LoggerFactory.getLogger(AVSResponseProcessor.class);

		log.info("===========Inside AVSResponseProcessor============");        
        
		exchange.getOut().setBody(exchange.getIn().getBody(String.class));
	}

}
