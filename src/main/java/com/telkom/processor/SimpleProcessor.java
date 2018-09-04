package com.telkom.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.telkom.response.DecisionDetails;
import com.telkom.response.TranResponseHeader;
import com.telkom.response.TransactNewAppOutput;
import com.telkom.response.TransactNewAppOutputResponse;
import com.telkom.route.SimpleRoute;

public class SimpleProcessor implements Processor
{
	
	Logger log = LoggerFactory.getLogger(SimpleProcessor.class);
    ObjectMapper mapper  = new ObjectMapper();
    
	
	public void process(Exchange exchange) throws Exception {
	
		TransactNewAppOutputResponse transactNewAppOutputResponse = new TransactNewAppOutputResponse();
		TransactNewAppOutput         transactNewAppOutput         = new TransactNewAppOutput();
		TranResponseHeader           tranResponseHeader           = new TranResponseHeader();
		DecisionDetails              decisionDetails              = new DecisionDetails();
		
		log.info("==========================Inside Simple Processor in Demo Service with Response From service is ==========="); 
		
	    decisionDetails.setAPPLICATION_NUMBER(1);
	    decisionDetails.setAPPLICATION_STATUS(0);
	    decisionDetails.setDATE_APPROVED("12/09/2019 05:11:45");
	    decisionDetails.setERROR_CODE(990);
	    decisionDetails.setERROR_DESCRIPTION("Error");
	    decisionDetails.setFRAUD_CODE("009988");
	    decisionDetails.setFRAUD_SUSPECTED("sbuddhjd");
	    decisionDetails.setFULL_PROCESS_COMPLETE("complete");
	    decisionDetails.setMAX_RANGE(1);
	    decisionDetails.setMIN_RANGE(3);
	    decisionDetails.setREASONCODE0("NA");
	    decisionDetails.setRECOMMENDED_CREDIT_LIMIT(13);
	    decisionDetails.setRECOMMENDED_DECISION("No Descision");
	    decisionDetails.setRECOMMENDED_PRODUCT("No Product");
	    
	    tranResponseHeader.setDecisionDetails(decisionDetails);
        tranResponseHeader.setSProcID("28");
        tranResponseHeader.setTranSystem("Telkom");
        transactNewAppOutput.setTranResponseHeader(tranResponseHeader);
        transactNewAppOutputResponse.setTransactNewAppOutput(transactNewAppOutput);
		
		exchange.getOut().setBody(mapper.writeValueAsString(transactNewAppOutputResponse));
		
		
	}
}
