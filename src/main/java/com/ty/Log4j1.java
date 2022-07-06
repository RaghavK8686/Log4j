package com.ty;

import java.io.IOException;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;

public class Log4j1 {

	static Logger logger=Logger.getLogger(Log4j.class);
	static Layout layout=new SimpleLayout();
	public static void main(String[] args) throws IOException
	{
		Appender appender=new ConsoleAppender(layout);
		logger.addAppender(appender);
		int a=10;
		if(a==0)
		{
			logger.debug("hey");
		//	System.out.println("Hi");
		}
		else
		{
			logger.info("if-condition doesnot work");
			//System.out.println("Bye");
		}
	}
}
//prints in console