package com.org.learningMaven.basicMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BrowserInvoke {
	WebDriver driver;
	
	@BeforeTest
	public void invokeMethod() 
	{
		System.setProperty("webdriver.chrome.driver","Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://unduit.com/uat/");
		driver.findElement(By.xpath("//ul[@id='rightNav']//a[@class='signinnav']")).click();
	}
	
	
	/*public void signin_one()
	{
		driver.findElement(By.xpath("//ul[@id='rightNav']//a[@class='signinnav']")).click();
	}*/
	
	public void sum()
	{	System.out.println("Sum");
	int x= 10;
	int y=10;
	int z = x+y;
	System.out.println(z);
		//Assert.assertEquals(20, x+y);
	}
	
	
	public void div()
	{	System.out.println("div");
	int x= 10;
	int y=10;
	
	int z = x/y;
	System.out.println(z);
		//Assert.assertEquals(1, x/y);
	}
	
	
	public void sub()
	{	System.out.println("sub");
	int x= 20;
	int y=10;
	int z = x-y;
	System.out.println(z);
		//Assert.assertEquals(10, x-y);
	}
	
	
	public void mul()
	{	System.out.println("mul");
	int x= 10;
	int y=10;
	int z = x*y;	
	System.out.println(z);
		//Assert.assertEquals(100, x*y);
	}
	
}
