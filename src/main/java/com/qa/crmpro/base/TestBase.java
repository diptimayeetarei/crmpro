package com.qa.crmpro.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	public static Properties prop;
	public static WebDriver driver;

	public TestBase()
	{
		try {
			prop= new Properties();
			FileInputStream fileobj=new FileInputStream(System.getProperty("user.dir")+"/src/main/java/com/qa/crmpro/properties/config.properties");
			prop.load(fileobj);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void driverInitialization()
	{
		
		driver=new ChromeDriver();
		String browsername=prop.getProperty("browser");
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "F:/Core java naveen/Crmpro/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(17, TimeUnit.SECONDS);
		}
		else
		{
			System.out.println("browser wrong");
		}
		driver.get("https://classic.crmpro.com/");
	}

}
