package com.qa.crmpro.util;

import com.qa.crmpro.base.TestBase;

public class TestUtil extends TestBase {
	public void switchToFrame()
	{
		driver.switchTo().frame("mainpanel");
	}

}
