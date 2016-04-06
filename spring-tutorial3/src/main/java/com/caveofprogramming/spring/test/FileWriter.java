package com.caveofprogramming.spring.test;

import javax.inject.Named;

import org.springframework.stereotype.Component;

@Component
@Named(value="mo")
public class FileWriter implements LogWriter{
	
	public void write(String text)
	{
		System.out.println(text);
	}
}
