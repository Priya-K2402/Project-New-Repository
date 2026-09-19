package com.omrbranch.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	Logger log = LogManager.getLogger(BaseClass.class);
	
	public static WebDriver driver;
	
	public byte[] screenshot()
	{
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		byte[] screenshotAs = screenshot.getScreenshotAs(OutputType.BYTES);
		return screenshotAs;
	}
	
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
	
	public void closeBrowser()
	{
		driver.close();
	}
	
	public void maximizeBrowser()
	{
		driver.manage().window().maximize();
	}
}
