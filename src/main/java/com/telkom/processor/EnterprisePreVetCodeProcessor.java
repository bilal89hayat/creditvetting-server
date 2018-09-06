package com.telkom.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.telkom.cmfs.model.EnterprisePrevetCodeResponseOp;

public class EnterprisePreVetCodeProcessor implements Processor {

	Logger logger = LoggerFactory.getLogger(EnterprisePreVetCodeProcessor.class);

	@Override
	public void process(Exchange exchange) throws Exception {

		logger.info("===== Inside EnterprisePreVetCode Response Processor =====");
				
		ObjectMapper mapper = new ObjectMapper();
		EnterprisePrevetCodeResponseOp dummyResponseObj = new EnterprisePrevetCodeResponseOp();
		dummyResponseObj.setStartServiceDate("2018-08-28T10:07:29.342Z");
		String hardCodedResponse = mapper.writeValueAsString(dummyResponseObj);
		
		logger.info("===== input body =====" + exchange.getIn().getBody().toString());
		exchange.getOut().setBody(hardCodedResponse);
		
	}

}