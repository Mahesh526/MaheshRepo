package com.sst.javadsl;
import java.util.logging.Logger;
import org.apache.camel.builder.RouteBuilder;
import java.util.logging.Level;
public class MyFirstRouterBuilder extends RouteBuilder {
	//assumes the current class is called logger
	private final static Logger LOGGER = Logger.getLogger(MyFirstRouterBuilder.class .getName()); 
     @Override
    public void configure() throws Exception {
        try{
        	
        	LOGGER.log(Level.INFO,  "**************MyFirstRouterBuilder******************** " );
            from( "file:///home/mahesh/workspace/Source?include='*.jpg'")
            .process(new LoggingProcessor())
            .to("sftp://mahesh@localhost:22/workspace/Destination?password=sst123");
            LOGGER.log(Level.INFO,  "************MyFirstRouterBuilder********************** " );
        }catch(Exception e){
        }
     }
}