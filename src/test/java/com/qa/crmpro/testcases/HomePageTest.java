package com.qa.crmpro.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.crmpro.base.TestBase;
import com.qa.crmpro.pages.CalenderPage;
import com.qa.crmpro.pages.CallsPage;
import com.qa.crmpro.pages.CasesPage;
import com.qa.crmpro.pages.CompaniesPage;
import com.qa.crmpro.pages.ContactsPage;
import com.qa.crmpro.pages.DealsPage;
import com.qa.crmpro.pages.HomePage;
import com.qa.crmpro.pages.LoginPage;
import com.qa.crmpro.pages.TasksPage;
import com.qa.crmpro.util.TestUtil;

public class HomePageTest extends TestBase {
	HomePage homepage;
	LoginPage loginpage;
	CalenderPage cd= new CalenderPage();

	CompaniesPage clp=new CompaniesPage();
	ContactsPage colp=new ContactsPage();
	DealsPage dlp=new DealsPage();
	TasksPage tlp=new TasksPage();
	CasesPage calandp =new CasesPage();
	CallsPage calp=new CallsPage();
	TestUtil t=new TestUtil();

	@BeforeMethod
	public void driverInitializationy() throws InterruptedException
	{
		driverInitialization();
		loginpage =new LoginPage();
		homepage=loginpage.loginToCrmPro(prop.getProperty("username"), prop.getProperty("password"));
	}
	@Test
	public void verifypagetitleTest()
	{
		homepage.verifypagetitle();
	}
	@Test
	public void verifyUserNameTest()
	{
		t.switchToFrame();
		homepage.verifyUserName();
	}
	@Test
	public void clickOnHomeTest()
	{
		t.switchToFrame();
		homepage.clickOnHome();
	}
	@Test
	public void clickOnCalenderTest()
	{
		t.switchToFrame();
		cd=homepage.clickOnCalender();
	}
	@Test
	public void clickOnCompaniesTest()
	{
		t.switchToFrame();
		clp=homepage.clickOnCompanies();
	}
	@Test
	public void clickOnContactsTest()
	{
		t.switchToFrame();
		colp=homepage.clickOnContacts();
	}

	public void clickOnTaskDeals()
	{
		t.switchToFrame();
		dlp=homepage.clickOnDeals();
	}

	@Test
	public void clickOnTaskTest()
	{
		t.switchToFrame();
		tlp=homepage.clickOnTask();
	}
	@Test
	public void clickOnCaseTest()
	{
		t.switchToFrame();
		calandp=homepage.clickOnCase();
	}
	@Test
	public void clickOnCallTest()
	{
		t.switchToFrame();
		calp=homepage.clickOnCall();
	}

	@AfterMethod
	public void driverCloset()
	{

		driver.quit();
	}

}
