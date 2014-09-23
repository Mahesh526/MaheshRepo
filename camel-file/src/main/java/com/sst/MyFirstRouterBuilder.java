package com.sst;

import java.util.logging.Logger;
import org.apache.camel.builder.RouteBuilder;
import java.util.logging.Level;
public class MyFirstRouterBuilder extends RouteBuilder {
	//assumes the current class is called logger
	private final static Logger LOGGER = Logger.getLogger(MyFirstRouterBuilder.class .getName()); 
     @Override
    public void configure() throws Exception {
        try{
        	
        	LOGGER.log(Level.INFO,  "********************************** " );
            from( "sftp://mahesh@localhost/workspace/Source?password=sst123")
            .to("file:///home/mahesh/workspace/Dest");
            LOGGER.log(Level.INFO,  "********************************** " );
        }catch(Exception e){
        }
     }
}