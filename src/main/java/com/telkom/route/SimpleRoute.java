package com.telkom.route;

import org.apache.camel.builder.RouteBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.telkom.creditvetting.transunion.processor.TransUnionProcessor;
import com.telkom.processor.SimpleProcessor;



public class SimpleRoute extends RouteBuilder{

	
	
	Logger log = LoggerFactory.getLogger(SimpleRoute.class);
	
	@Override
	public void configure() throws Exception {

		
		from("cxfrs://bean://restService")
		.choice()
		        .when()
		               .simple("${headers.operationName} == 'swaggerPostServiceExperian'")
				       .process(new SimpleProcessor())
				 .when()
		               .simple("${headers.operationName} == 'processCreditWorthyResponseTransUnion'")
				       .process(new TransUnionProcessor())
				      // .setHeader(Exchange.HTTP_METHOD, constant("POST"))
				      // .setHeader(Exchange.CONTENT_TYPE, constant("text/plain"))
				       // .to("http://localhost:9002/transunionservice/processCreditWorthyResponse?bridgeEndpoint=true")
		        .when()
                       .simple("${headers.operationName} == 'runAVS'")   
	                   .end();
		
	}

}