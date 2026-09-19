package com.omrbranch.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.omrbranch.reporting.Reporting;
import com.omrbranch.utility.BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(dryRun= false,plugin = {"pretty","json:target/outout.json"},features = "C:\\Users\\shanm\\eclipse-workspace\\OmrBranchSample\\src\\test\\resources\\features" ,
glue={"com.omrbranch.stepdefenition","com.omrbranch.hooks"})

public class TestRunnerClass extends BaseClass {
	
	@AfterClass
	public static void afterClass()
	{
		Reporting.generateJvmReport(getProjectPath()+"//target//output.json");
	}

}

