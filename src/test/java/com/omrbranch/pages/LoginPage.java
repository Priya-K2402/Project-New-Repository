package com.omrbranch.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.utility.BaseClass;

public class LoginPage extends BaseClass{
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	private WebElement txtUsername;
	
	@FindBy(id="pass")
	private WebElement txtPassword;
	
	@FindBy(xpath="//button[@value='login']")
	private WebElement btnLogin;
	
	public void login(String userName, String password)
	{
		sendKeysElement(txtUsername, userName);
		sendKeysElement(txtPassword, password);
		clickElement(btnLogin);
	}
	

}

