package com.agilecrmautomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoAutomation {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		WebElement element = driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]"));
		element.clear();
		element.sendKeys("vishu");
		driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys("jadhav");
		WebElement email = driver.findElement(By.xpath("//input[@type=\"email\"]"));
		email.sendKeys("vishal@jadhav.com");
		WebElement phone = driver.findElement(By.xpath("//input[@type=\"tel\"]"));
		phone.sendKeys("5567588");
		List<WebElement> radioButton = driver.findElements(By.xpath("//input[@type='radio']"));
		for (WebElement radio : radioButton) {
			String radiob = radio.getAttribute("value");
			if (radiob.equals("Male")) {
				radio.click();
				break;
			}
		}
		List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));

		for (WebElement check : checkbox) {
			String checkboxx = check.getAttribute("value");

			if (checkboxx.equals("Cricket")) {
				check.click();
			}

		}

	}

}
