package com.sst;

import org.apache.camel.CamelContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
public class CamelspringTest {
	public static void main(String args[]) throws Exception {
		try {
			ApplicationContext springcontext = new FileSystemXmlApplicationContext(
					"file:///home/mahesh/workspace/camel-file/src/main/resources/META-INF/spring/filespring.xml");
			CamelContext context = springcontext.getBean("sqsContext",CamelContext.class);
			context.start();
			Thread.sleep(10000);
			context.stop();
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}