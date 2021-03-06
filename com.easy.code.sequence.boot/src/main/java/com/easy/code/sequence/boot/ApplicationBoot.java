package com.easy.code.sequence.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//import net.sf.cglib.core.DebuggingClassWriter;

@SpringBootApplication
//@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.easy.code.sequence"})
public class ApplicationBoot {
	
	 public static void main(String[] args) throws Exception {
		// 	System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "E://cjlib/");
		 	
	        SpringApplication.run(ApplicationBoot.class, args);
	    }
}
