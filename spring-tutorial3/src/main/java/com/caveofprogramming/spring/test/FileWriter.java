package com.caveofprogramming.spring.test;

import org.springframework.stereotype.Component;

@Component("mo")
public class FileWriter implements LogWriter {

	public void write(String text) {
		System.out.println(text);
	}
}
