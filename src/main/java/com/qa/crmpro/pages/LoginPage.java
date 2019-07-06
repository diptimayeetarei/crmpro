package com.qa.crmpro.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.crmpro.base.TestBase;

public class LoginPage extends TestBase{
	
	//page factory
	
	@FindBy(xpath="//img[@class='img-responsive']")
	WebElement imgavail;
	
	@FindBy(xpath="//input[@name='username']")
	WebElement usernameu;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement passwordg;
		
	@FindBy(xpath="//input[@type='submit' and  @value='Login']")
	WebElement login;
	
	//all elements initialization
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//functions
	public String getTitle()
	{
		return driver.getTitle();
	}
	
	public Boolean verifyLogo()
	{
	return	imgavail.isDisplayed();
	}
	
	public HomePage loginToCrmPro(String un,String pwd) throws InterruptedException
	{
		usernameu.sendKeys(un);
		passwordg.sendKeys(pwd);
		Thread.sleep(10000);
		login.click();
		return new HomePage();
	}
}
