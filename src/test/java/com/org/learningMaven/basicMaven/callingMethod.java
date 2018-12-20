package com.org.learningMaven.basicMaven;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class callingMethod extends BrowserInvoke {
	
	@Test
	public void callanother()
	{
		BrowserInvoke BI = new BrowserInvoke();
		BI.div();
	}
	
	/*@Test
	public void signin()
	{
		BrowserInvoke BI = new BrowserInvoke();
		BI.signin_one();
	}*/
	
}
