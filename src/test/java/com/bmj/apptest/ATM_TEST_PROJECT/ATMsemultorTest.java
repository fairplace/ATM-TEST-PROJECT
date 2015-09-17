package com.bmj.apptest.ATM_TEST_PROJECT;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;

import driverFeature.Driver;

public class ATMsemultorTest extends Driver {
	
public void EnterValidCard(String object, String object1){
	driver.findElement(By.id("validcardnumber")).sendKeys("411233333333331");	
	
	
}	

public void ClickNextbutton(String object){
	driver.findElement(By.id("nextbutton")).click();
	
}

public void Verify4options(List<List<String>>options){

		 Assert.assertTrue(driver.findElement(By.id(options.get(1).get(0))).isDisplayed());
		 Assert.assertTrue(driver.findElement(By.id(options.get(2).get(0))).isDisplayed());
		 Assert.assertTrue(driver.findElement(By.id(options.get(3).get(0))).isDisplayed());
		 Assert.assertTrue(driver.findElement(By.id(options.get(4).get(0))).isDisplayed());
}
}
