package com.bjnja.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App 
{
	@Autowired
	void setEnviroment(Environment env) {
	    System.out.println("nja-config.appname from env: " 
	        + env.getProperty("nja-config.appname"));
	}
		
    public static void main( String[] args )
    {
    	SpringApplication.run(App.class, args);
    }
}
