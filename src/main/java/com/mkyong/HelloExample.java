package com.mkyong;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HelloExample{
	
	final static Logger logger = LogManager.getLogger(HelloExample.class.getName());
	
	public static void main(String[] args) {
	
		HelloExample obj = new HelloExample();
		obj.runMe("Sebastian");
		
	}
	
	private void runMe(String parameter){
				
		logger.debug("This is debug : " + parameter);					
                logger.info("This is info : " + parameter);				
		logger.warn("This is warn : " + parameter);
		logger.error("This is error : " + parameter);
		logger.fatal("This is fatal : " + parameter);
		
	}
	
}