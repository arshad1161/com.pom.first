package com.pom.first.base;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.pom.first.util.Util_methods;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testbase 
{
	FileInputStream fis;
	public Properties pro;
	public static WebDriver driver;
	
	public Testbase()
	{
		try {
		fis=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\com.pom.first\\src\\main\\java\\com\\pom\\first\\cofig\\configuration.properties");
		pro=new Properties();
		pro.load(fis);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	public void browser_setup()
	{
		String browser=pro.getProperty("Browsername");
		if(browser.equalsIgnoreCase("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("Edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else
		{
			System.out.println("Given Browser Name Is Wrong");
		}
		driver.get(pro.getProperty("url"));
		Util_methods.max_window();
	}

}
