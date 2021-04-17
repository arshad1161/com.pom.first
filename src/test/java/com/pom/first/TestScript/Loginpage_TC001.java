package com.pom.first.TestScript;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pom.first.base.Testbase;
import com.pom.first.pages.loginpage;

public class Loginpage_TC001 extends Testbase 
{
	loginpage page;
	
	@BeforeTest
	public void setup()
	{
		browser_setup();
		page=new loginpage();
		
	}
	@Test
	public void validate_title()
	{
		String title=page.verifytitle();
		Assert.assertEquals(title, "OrangeHRM");
	}
	@Test
	public void validate_login()
	{
		page.verify_login("Admin", "admin123");
	}
	@AfterTest
	public void tearup()
	{
		driver.close();
	}

}
