package com.zensar.spring.test;

import org.springframework.stereotype.Component;

@Component("mylogger")
public class ConsoleWriter implements LogWriter {

	public void write(String text) {
		System.out.println(text);
	}

}
