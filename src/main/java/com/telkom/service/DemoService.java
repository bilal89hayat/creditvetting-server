package com.telkom.service;

import java.io.IOException;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

@Path("/")
public class DemoService {
	

	
		
		private static Logger logger = LoggerFactory.getLogger(DemoService.class);
		
		public DemoService() {
			
			logger.info("===================inside demo service constructor=======================");
		}


		
		
		@POST
		@Path("/processCreditWorthyResponseTransUnion")
		public String processCreditWorthyResponseTransUnion(String body) throws JsonParseException, JsonMappingException, IOException {
			
			logger.info("========== Inside Demo Post Service processCreditWorthyResponseTransUnion =========");

			
			return body;
		}
		@POST
		@Path("/swaggerPostCall")
		public String swaggerPostServiceExperian(String Body) throws JsonParseException, JsonMappingException, IOException {
			
			logger.info("========== Inside Demo Post Service =========");

			
			return "Success";
		}
		
		@POST
	    @Path("/runavs")
	    public String runAVS(String body) {
	        
	         logger.info("inside runavs :"+ body);
	        return body;
	    }	
		}
		
		



