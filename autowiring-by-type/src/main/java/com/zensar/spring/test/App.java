package com.zensar.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/zensar/spring/test/beans/beans.xml");
		
		Logger logger = (Logger)context.getBean("logger");
		
		logger.writeConsole("Hello there");
		logger.writeFile("Hi again");
		
		((ClassPathXmlApplicationContext)context).close();
	}

}
