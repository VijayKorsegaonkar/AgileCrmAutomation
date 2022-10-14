package com.agilecrmautomation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DemoAlert extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		// Alert alt;
		launchBrowser("chrome");

		driver.navigate().to("https://demo.automationtesting.in/Frames.html");
		/*
		 * driver.manage().window().maximize();
		 * driver.findElement(By.xpath("//div[@id='OKTab']/button")).click();
		 * alt=driver.switchTo().alert(); Thread.sleep(1000); alt.accept();
		 * driver.findElement(By.xpath("//a[contains(text(),'Alert with OK &')]")).click
		 * (); driver.findElement(By.
		 * xpath("//button[contains(text(),'display a confirm box ')]")).click();
		 * alt=driver.switchTo().alert(); Thread.sleep(2000); alt.accept();
		 * driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]")).
		 * click(); driver.findElement(By.
		 * xpath("//button[contains(text(),'demonstrate the prompt box')]")).click();
		 * alt=driver.switchTo().alert(); alt.sendKeys("Selenium Implementation");
		 * Thread.sleep(1000); alt.accept();
		 */

		driver.switchTo().frame(driver.findElement(By.id("singleframe")));
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("selenium");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[contains(text(),'Iframe with in')]")).click();

		WebElement element = driver.findElement(By.xpath("//div[@id='Multiple']/iframe"));
		driver.switchTo().frame(element);
		driver.switchTo().frame(0);

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Automation");

	}

}
