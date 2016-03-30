package com.caveofprogramming.spring.test;

import org.springframework.beans.factory.annotation.Autowired;

public class Logger {

	private LogWriter consoleWriter;
	private LogWriter fileWriter;

	@Autowired
	public void setConsoleWriter(LogWriter consoleWriter) {
		this.consoleWriter = consoleWriter;
	}
	
	@Autowired
	public void setFileWriter(LogWriter fileWriter) {
		this.fileWriter = fileWriter;
	}
	
	public void writeFile(String text)
	{
		fileWriter.write(text);
	}
	
	public void writeConsole(String text)
	{
		consoleWriter.write(text);
	}
	
	

}
