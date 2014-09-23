package com.sst;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;
public class CamelJavaTest {
	private final static Logger LOGGER = Logger.getLogger(CamelJavaTest.class .getName()); 
	
	public static void main(String args[]) throws Exception {
		
		CamelContext context = new DefaultCamelContext();
		LOGGER.log(Level.INFO,  "********************************** " );
		context.addRoutes(new MyFirstRouterBuilder());
		LOGGER.log(Level.INFO,  "********************************** " );
		context.start();

		Thread.sleep(30000);

		context.stop();
}
}