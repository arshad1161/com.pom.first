package com.pom.first.util;

import java.util.concurrent.TimeUnit;

import com.pom.first.base.Testbase;

public class Util_methods extends Testbase
{
	public static void max_window()
	{
		
		driver.manage().window().maximize();
	}
	public void implicitywait(int time)
	{
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}

}
