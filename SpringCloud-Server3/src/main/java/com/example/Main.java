package com.example;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Main {
	
	static Log logger = LogFactory.getLog(Main.class);

    public static void main(String args[]) {
		logger.info("Hello World Test1 Project");
        //System.out.println(new Main().sayHello());
    }

    public String sayHello() {
        return "Hello";
    }
}