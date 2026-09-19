package com.omrbranch.pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class PaymentPage {
	public static String getProjectPath()
	{
		String property = System.getProperty("user.dir");
		return property;
	}
	
	public String getPropertyFileValue(String key) throws FileNotFoundException, IOException
	{
		Properties properties = new Properties();
		properties.load(new FileInputStream(getProjectPath()+"//src//test//resources//config//config.properties"));
		Object object = properties.get(key);
		String value = (String) object;
		log.info("Get value for file"+value);
		return value;
	}
	
	
	public void display()
	{
		System.out.println("display");
	}
}
