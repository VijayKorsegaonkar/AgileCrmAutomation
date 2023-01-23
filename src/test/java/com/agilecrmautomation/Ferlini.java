package com.agilecrmautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ferlini extends BaseClass {
	
	@BeforeTest
	public void launch() {
		launchBrowser("chrome");
		driver.navigate().to("https://www.ferlini.it");
		
	}
	@Test
	public void getTitle() {
		String PageTitle=driver.getTitle();
		System.out.println(PageTitle);
		
	}
	@Test(dependsOnMethods="getTitle")
	public void click() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("scroll(0,600)");
		driver.findElement(By.xpath("//span[contains(text(),'Contattaci')]")).click();
	String title=driver.getTitle();
	System.out.println(title);
	
	}
	@Test(dependsOnMethods="click")
	public void fillForm() {
		
		driver.findElement(By.xpath("//label[contains(text(),'Messaggio')]")).sendKeys("vijay");
		driver.findElement(By.xpath("//label[contains(text(),'Nome e ')]")).sendKeys("vijay1223");
	}

}
