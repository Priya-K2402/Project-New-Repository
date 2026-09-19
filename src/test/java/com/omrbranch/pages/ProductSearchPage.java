package com.omrbranch.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.utility.BaseClass;

public class ProductSearchPage extends BaseClass {
      
	public ProductSearchPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@data-testid='username']")
	private WebElement textLoginMessage;

	public String getLoginMessageText() {
		String textElement = getTextElement(textLoginMessage);
		return textElement;
	}
}
