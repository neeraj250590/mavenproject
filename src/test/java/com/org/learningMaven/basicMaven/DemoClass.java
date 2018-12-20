package com.org.learningMaven.basicMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class DemoClass {
WebDriver driver;

	@Test
	public void signinn()
	{
		driver.findElement(By.xpath("//ul[@id='rightNav']//a[@class='signinnav']")).click();
	}
	
}
