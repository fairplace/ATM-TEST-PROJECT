package com.bmj.apptest.ATM_TEST_PROJECT;

import org.openqa.selenium.By;
import driverFeature.Driver;

public class ATMTest extends Driver  {
	
	public void Atmtest(){
	driver.findElement(By.id("cardnumber")).sendKeys("4111111111113333");
	driver.findElement(By.id("nextbutton")).click();
	driver.findElement(By.id("ValidPIN")).sendKeys("3344");
	driver.findElement(By.id("next")).click();
	}
}