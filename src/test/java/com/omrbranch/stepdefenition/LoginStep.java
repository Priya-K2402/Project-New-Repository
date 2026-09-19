package com.omrbranch.stepdefenition;

import org.junit.Assert;

import com.omrbranch.pageobjectmanager.PageObjectManager;
import com.omrbranch.utility.BaseClass;

import io.cucumber.java.en.*;

public class LoginStep extends BaseClass{
	
	PageObjectManager pom = new PageObjectManager();

	@Given("user is on the omrbranch page")
	public void user_is_on_the_omrbranch_page() {
	   
	}
	@When("user enters {string} , {string}")
	public void user_enters(String userName, String password) {
		pom.getLoginPage().login(userName, password);
		
	    
	}
	@Then("user should verify login page of success message")
	public void user_should_verify_login_page_of_success_message(String expLoginMessage) {
		String actLoginMessage = pom.getprProductSearchPage().getLoginMessageText();
		Assert.assertEquals(expLoginMessage, actLoginMessage);
		
	    
	}

}
