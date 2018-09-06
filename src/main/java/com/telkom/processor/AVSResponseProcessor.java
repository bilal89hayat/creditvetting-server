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
		exchange.getIn().setBody("{\r\n" + 
				"  \"ARR\": {\r\n" + 
				"    \"EL\": {},\r\n" + 
				"    \"ARL\": {\r\n" + 
				"      \"AR\": {\r\n" + 
				"        \"CR\": \"string\",\r\n" + 
				"        \"RQV\": \"string\",\r\n" + 
				"        \"RQM\": \"string\",\r\n" + 
				"        \"BCV\": {},\r\n" + 
				"        \"ACV\": {},\r\n" + 
				"        \"ATV\": {},\r\n" + 
				"        \"IDV\": {},\r\n" + 
				"        \"INV\": {},\r\n" + 
				"        \"NV\": {},\r\n" + 
				"        \"AD\": {},\r\n" + 
				"        \"AC\": {},\r\n" + 
				"        \"O3\": {},\r\n" + 
				"        \"AS\": {},\r\n" + 
				"        \"TXV\": {},\r\n" + 
				"        \"D1V\": \"string\",\r\n" + 
				"        \"D1P\": \"string\",\r\n" + 
				"        \"D2V\": \"string\",\r\n" + 
				"        \"D2P\": \"string\",\r\n" + 
				"        \"D3V\": \"string\",\r\n" + 
				"        \"D3P\": \"string\",\r\n" + 
				"        \"D4V\": \"string\",\r\n" + 
				"        \"D4P\": \"string\",\r\n" + 
				"        \"D5V\": \"string\",\r\n" + 
				"        \"D5P\": \"string\",\r\n" + 
				"        \"PNV\": \"string\",\r\n" + 
				"        \"EMV\": \"string\"\r\n" + 
				"      }\r\n" + 
				"    }\r\n" + 
				"  }\r\n" + 
				"}");
		exchange.getOut().setBody(exchange.getIn().getBody(String.class));
	}

}
