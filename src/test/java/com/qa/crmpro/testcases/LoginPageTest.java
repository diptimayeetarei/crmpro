package com.qa.crmpro.testcases;

import junit.framework.Assert;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.crmpro.base.TestBase;
import com.qa.crmpro.pages.HomePage;
import com.qa.crmpro.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	
	@BeforeMethod
	public void driverInitializationv()
	{
		driverInitialization();
		loginpage =new LoginPage();
		
	}
	
	@Test
	public void verifyTitle()
	{
		String pagetitle=loginpage.getTitle();
		System.out.println(loginpage.getTitle());
		//Assert.assertEquals(pagetitle, "CRMPRO","Invalid page title");
	}
	
	@Test
	public void verifyLogo()
	{
		loginpage.verifyLogo();
	}
	
	@Test
	public void LoginToCrmPro() throws InterruptedException
	{
		homepage=loginpage.loginToCrmPro(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void driverClose()
	{
		driver.quit();
	}
	

}
