package com.telkom.utility;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.telkom.creditvetting.transunion.model.TransUnionParentResponse;
import com.telkom.creditvetting.transunion.model.Transunion;
import com.telkom.creditvetting.transunion.model.XactCallResult;


public class Mapper {
	private static Logger logger = LoggerFactory.getLogger(Mapper.class);
	public static TransUnionParentResponse processDummyResponse(){
		TransUnionParentResponse transUnionParentResponse = new TransUnionParentResponse();
		
		XactCallResult xactCallResult= new XactCallResult();
		
		Transunion transunion = new Transunion();
		transunion.setApplicationNumber("1712050012014");
		transunion.setRecommendedDecision("Approve");
		transunion.setRecommendedCreditLimit("R5000.00");
		transunion.setRecommendedProduct("Recommended Product");
		transunion.setMinRange(10);
		transunion.setMaxRange(10);
		transunion.setDateApproved("2015-05-08T11:31:33.717+02:00");
		transunion.setApplicationStatus("Approve");
		transunion.setFraudSuspected("N");
		transunion.setFullProcessComplete("Y");
		transunion.setProduct("Standard");
		transunion.setReasonCode0(1);
		transunion.setReasonCode1("A");
		transunion.setReasonCode2("B");
		transunion.setReasonCode3("C");
		transunion.setReasonCode4("D");
		transunion.setReasonCode5("E");
		transunion.setReasonCode6("F");
		transunion.setReasonCode7("G");
		transunion.setReasonCode8("H");
		transunion.setReasonCode9("I");
		transunion.setErrorCode("2");
		transunion.setErrorDescription("Error Description");
		transunion.setFraudCode("Fraud Code");
		
		xactCallResult.setTransunion(transunion);
		transUnionParentResponse.setXactCallResult(xactCallResult);
		return transUnionParentResponse;
	}
	
}