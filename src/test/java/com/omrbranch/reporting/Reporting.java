package com.omrbranch.reporting;



import java.io.*;
import java.util.*;

import com.omrbranch.utility.BaseClass;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting extends BaseClass {
	
public static void generateJvmReport(String jsonFile)
{
	Configuration configuration = new Configuration(new File(getProjectPath()+"//target"), "OMRBRANCH Automation");
	configuration.addClassifications("OS", "Windows 11");
	configuration.addClassifications("Browser", "CHROME");
	configuration.addClassifications("Browser version", "123");
	List<String> jsonFiles = new ArrayList<String>();
	jsonFiles.add(jsonFile);
	ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
	reportBuilder.generateReports();
}
}
