package com.Options;

import org.openqa.selenium.chrome.ChromeOptions;

import com.agilecrmautomation.BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Class1 extends BaseClass {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions cap=new ChromeOptions();
		cap.addArguments("--starts-maximized");
		
		driver.navigate().to("http://www.cacert.com");
		driver.manage().window().maximize();

	}

}
