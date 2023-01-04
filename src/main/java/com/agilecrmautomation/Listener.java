package com.agilecrmautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Listener extends BaseClass{
	public static void main(String[] args) {
		
		
		launchBrowser("chrome");

		driver.navigate().to("https://www.amazon.in/");
		
		
	}
	
}