package com.agilecrmautomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DropDownWithoutSelect extends BaseClass {

	public static void main(String[] args) {
		launchBrowser("chrome");
		  
		 driver.navigate().to("https://demo.automationtesting.in/Register.html");
		 driver.manage().window().maximize();
	//WebElement skills=	driver.findElement(By.xpath("//select[@id='Skills']"));
		List<WebElement> Skills=driver.findElements(By.xpath("//select[@id='Skills']/option"));
		for(WebElement skill:Skills) {
			if(skill.getText().equals("Android")) {
				skill.click();
				break; 
			}
			
		}

	}

}
