package com.agilecrmautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;

public class StaleElement extends BaseClass {

	public static void main(String[] args) {
		launchBrowser("chrome");
		//ChromeOptions cap=new ChromeOptions();
		//cap.addArguments("");
		driver.manage().getCookieNamed("");
		  
		 driver.navigate().to("https://www.omnicomgroup.com/");
		 driver.manage().window().maximize();
		 WebElement news=driver.findElement(By.xpath("//a[contains(text(),'Newsroom')]"));
news.click();
driver.navigate().back();

news.click();
	}

}
