package com.pom.first.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pom.first.base.Testbase;

public class loginpage extends Testbase
{

	@FindBy(id="logInPanelHeading")
	WebElement loginheadline;
	
	@FindBy(name="txtUsername")
	WebElement usernametxtbx;
	
	@FindBy(name="txtPassword")
	 WebElement passwordtxtbtx;
	
	@FindBy(id="btnLogin")
	public WebElement loginbtn;
	
	@FindBy(xpath="//a[text()='Forgot your password?']")
	WebElement forgotpass;
	
	@FindBy(id="btnLogin")
	public WebElement logoutbtn;
	
	public loginpage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifytitle()
	{
		return driver.getTitle();
	}
	 public void verify_login(String username,String password)
	 {
		 usernametxtbx.sendKeys(username);
		 passwordtxtbtx.sendKeys(password);
		 loginbtn.click();
		 
	 }
}
