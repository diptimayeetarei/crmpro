package com.qa.crmpro.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.crmpro.base.TestBase;
import com.qa.crmpro.pages.ContactsPage;
import com.qa.crmpro.pages.HomePage;
import com.qa.crmpro.pages.LoginPage;
import com.qa.crmpro.util.TestUtil;

public class ContactsPageTest extends TestBase {
	HomePage homepage;
	LoginPage loginpage;
	TestUtil t;
	ContactsPage cto;
	
	@BeforeMethod
	public void driverInitializationy() throws InterruptedException
	{
		driverInitialization();
		
		t=new TestUtil();
		cto=new ContactsPage();
		loginpage =new LoginPage();
		homepage=loginpage.loginToCrmPro(prop.getProperty("username"), prop.getProperty("password"));
		t.switchToFrame();
		
	}
	
	@Test
	public void verifyCopntactsCreation()
	{
		homepage.clickOnNewContact();
		cto.createNewContact("dipto", "tarei");
	}
	@AfterMethod
	public void closedriver()
	{
		driver.quit();
	}

}
