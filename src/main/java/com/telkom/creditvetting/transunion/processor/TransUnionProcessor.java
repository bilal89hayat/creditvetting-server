package com.telkom.creditvetting.transunion.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.telkom.creditvetting.transunion.model.TransUnionParentResponse;
import com.telkom.utility.Mapper;

public class TransUnionProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		// TODO Auto-generated method stub
		ObjectMapper mapper = new ObjectMapper();
		TransUnionParentResponse transUnionParentResponse = Mapper.processDummyResponse();

		exchange.getOut().setBody(mapper.writeValueAsString(transUnionParentResponse));
	}

}
