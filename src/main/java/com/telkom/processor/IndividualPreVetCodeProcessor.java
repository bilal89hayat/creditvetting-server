package com.telkom.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.telkom.cmfs.model.IndividualPreVetCodeResponseOp;


public class IndividualPreVetCodeProcessor implements Processor {

	Logger logger = LoggerFactory.getLogger(IndividualPreVetCodeProcessor.class);

	@Override
	public void process(Exchange exchange) throws Exception {

		logger.info("===== Inside IndividualPreVetCode Response Processor =====");
		
		//Passing hard coded response for the exposed service
		ObjectMapper mapper = new ObjectMapper();
		IndividualPreVetCodeResponseOp mockObject = new IndividualPreVetCodeResponseOp();
		mockObject.setStartServiceDate("2018-08-28T10:07:29.342Z");
		String hardCodedResponse = mapper.writeValueAsString(mockObject);
		
		logger.info("===== input body =====" + exchange.getIn().getBody().toString());
		
		exchange.getOut().setBody(hardCodedResponse);

	}

	
}