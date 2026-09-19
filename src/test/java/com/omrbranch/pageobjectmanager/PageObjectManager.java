package com.omrbranch.pageobjectmanager;

import com.omrbranch.pages.LoginPage;
import com.omrbranch.pages.ProductSearchPage;

public class PageObjectManager {
	private LoginPage loginPage;
	private ProductSearchPage productSearchPage;
	
	public LoginPage getLoginPage()
	{
		return (loginPage==null)? loginPage = new LoginPage(): loginPage;
	}
	
	public ProductSearchPage getprProductSearchPage()
	{
		return (productSearchPage==null)? productSearchPage = new ProductSearchPage() : productSearchPage;
	}

}


