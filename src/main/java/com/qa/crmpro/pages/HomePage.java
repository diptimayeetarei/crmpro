package com.qa.crmpro.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.crmpro.base.TestBase;

public class HomePage extends TestBase{
	//Page factory
	
	@FindBy(xpath="//td[contains(text(),'User: DIPTIMAYEE  TAREI')]/parent::tr//td")
	WebElement usernameincrm;
	
	@FindBy(xpath="//a[@title='Home']")
	WebElement homexpath;
	
	@FindBy(xpath="//a[@title='Calendar']")
	WebElement calenderxpath;
	
	@FindBy(xpath="//a[@title='Companies']")
	WebElement companiesxpath;
	
	@FindBy(xpath="//a[@title='Contacts']")
	WebElement contactsxpath;
	
	@FindBy(xpath="//a[@title='Deals']")
	WebElement dealsxpath;
	
	@FindBy(xpath="//a[@title='Tasks']")
	WebElement taskxpath;
	
	@FindBy(xpath="//a[@title='Cases']")
	WebElement casesxpath;
	
	@FindBy(xpath="//a[@title='Call']")
	WebElement callxpath;
	
	@FindBy(xpath="//a[@title='New Contact']")
	WebElement newcontact;
	
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//functions
	
	public String verifypagetitle()
	{
		return driver.getTitle();
	}
	public Boolean verifyUserName()
	{
		return usernameincrm.isDisplayed();
	}
	
	public void clickOnHome()
	{
		homexpath.click();
	}
	public CalenderPage clickOnCalender()
	{
		 calenderxpath.click();
		 return new CalenderPage();
	}
	public CompaniesPage clickOnCompanies()
	{
		companiesxpath.click();
		return new CompaniesPage();
	}
	public ContactsPage clickOnContacts()
	{
		contactsxpath.click();
		return new ContactsPage();
	}
	
	public DealsPage clickOnDeals()
	{
		dealsxpath.click();
		return new DealsPage();
		
		
	}
	public TasksPage clickOnTask()
	{
		taskxpath.click();
		return new TasksPage();
	}
	public CasesPage clickOnCase()
	{
		casesxpath.click();
		return new CasesPage();
	}
	public CallsPage clickOnCall()
	{
		callxpath.click();
		return new CallsPage();
	}
	public ContactsPage clickOnNewContact()
	{
		Actions action= new Actions(driver);
		action.moveToElement(contactsxpath).build().perform();
		newcontact.click();
		return new ContactsPage();
		
		//after clicking we have to fill the form
		//so we have to go to contacts page to fill the form
		
		
	}
}
