package com.qa.crmpro.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



//import org.apache.bcel.generic;

import org.openqa.selenium.support.ui.Select;

import com.qa.crmpro.base.TestBase;

public class ContactsPage extends TestBase{
	
	//page facory to fill the form
	
	//elements
	
	@FindBy(xpath="//select[@name='title']")
	WebElement title;
	
	@FindBy(xpath="//input[@id='first_name']")
	WebElement first_name;
	
	
	
	@FindBy(xpath="//input[@id='surname']")
	WebElement last_name;
	/*
	@FindBy(xpath="")
	WebElement middle_name;
	
	@FindBy(xpath="")
	WebElement suffix;
	
	@FindBy(xpath="")
	WebElement image;
	
	@FindBy(xpath="")
	WebElement nickname;
	
	@FindBy(xpath="")
	WebElement company;
	
	
	@FindBy(xpath="")
	WebElement posistion;
	
	

	@FindBy(xpath="")
	WebElement department;
	

	@FindBy(xpath="")
	WebElement supervisor;
	

	@FindBy(xpath="")
	WebElement assistant;
	

	@FindBy(xpath="")
	WebElement refferedby;

	@FindBy(xpath="")
	WebElement owner;
	
	
	

	@FindBy(xpath="")
	WebElement category;
	

	@FindBy(xpath="")
	WebElement status;
	
	@FindBy(xpath="")
	WebElement phone;
	@FindBy(xpath="")
	WebElement mobile;
	
	@FindBy(xpath="")
	WebElement homephone;
	@FindBy(xpath="")
	WebElement fax;
	
	@FindBy(xpath="")
	WebElement email;
	@FindBy(xpath="")
	WebElement emailalt;
	@FindBy(xpath="")
	WebElement recvemail;
	@FindBy(xpath="")
	WebElement recievesms;
	@FindBy(xpath="")
	WebElement allowcalls;
	@FindBy(xpath="")
	WebElement managerid;
	@FindBy(xpath="")
	WebElement messengernetwork;
	@FindBy(xpath="")
	WebElement skypeid;
	@FindBy(xpath="")
	WebElement source;
	@FindBy(xpath="")
	WebElement birthday;
	@FindBy(xpath="")
	WebElement identifier;
	@FindBy(xpath="")
	WebElement address_title;
	@FindBy(xpath="")
	WebElement type;
	@FindBy(xpath="")
	WebElement defaultaddress;
	@FindBy(xpath="")
	WebElement city;
	@FindBy(xpath="")
	WebElement stateprovienence;
	@FindBy(xpath="")
	WebElement zip;
	@FindBy(xpath="")
	WebElement postalcode;
	@FindBy(xpath="")
	WebElement country;
	
	@FindBy(xpath="")
	WebElement tags;
	@FindBy(xpath="")
	WebElement notedescription;
	@FindBy(xpath="")
	WebElement contact_time_zone;
	@FindBy(xpath="")
	WebElement filtertimebyCountry;
	*/
	
	@FindBy(xpath="//*[@id='contactForm']/table/tbody/tr[1]/td/input[2]")
	WebElement save;
	
	
	
	
	
	public void createNewContact(String fname, String lname)
	{
		Select scd= new Select(title);
		scd.selectByVisibleText("Miss");
		first_name.sendKeys(fname);
		last_name.sendKeys(lname);
		save.click();
	}
}
