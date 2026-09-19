package com.omrbranch.hooks;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.omrbranch.utility.BaseClass;

import io.cucumber.java.*;

public class HooksClass extends BaseClass {
	
	Logger log = LogManager.getLogger(HooksClass.class);
	
	@Before
	public void beforeScenario() throws FileNotFoundException, IOException
	{
		browserLaunch(getPropertyFileValue("browser"));
		log.info("Browser Launch");
		enterApplicationUrl(getPropertyFileValue("url"));
		log.info("Load Url");
		maximizeWindow();
		implicitlyWait();
	}
	
	@After
	public void afterSceneario()
	{
		closeBrowser();
	}
	
	@AfterStep
	public void afterEachStep(Scenario scenario)
	{
		scenario.attach(screenshot(), "image/png","Every Step");
	}
}
