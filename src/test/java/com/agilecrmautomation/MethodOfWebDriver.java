package com.agilecrmautomation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.Select;

public class MethodOfWebDriver extends BaseClass {

	public static void main(String[] args) throws AWTException {
		launchBrowser("chrome");

		driver.navigate().to("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath("//input[@placeholder='First Name']"));

		element.clear();
		element.sendKeys("Vijay");
		WebElement element1 = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		element1.clear();
		element1.sendKeys("Korsegaonkar");
		WebElement element2 = driver.findElement(By.xpath("//input[@type='email']"));
		element2.clear();
		element2.sendKeys("vlorsegaonkar@gmail.com");
		WebElement element3 = driver.findElement(By.xpath("//input[@type='tel']"));
		element3.clear();
		element3.sendKeys("7798266143");
		WebElement element4 = driver.findElement(By.xpath("//input[@value='Male']"));
		element4.click();
		driver.findElement(By.id("checkbox1")).click();
		driver.findElement(By.id("checkbox3")).click();
		WebElement language = driver.findElement(By.id("msdd"));
	
		language.sendKeys("English");
		WebElement skill = (driver.findElement(By.xpath("//select[@id='Skills']")));
		skill.click();

		// List<WebElement>
		// checkbox=driver.findElements(By.xpath("//input[@type='radio']"));

		driver.findElement(By.xpath("//span[@role='combobox']")).click();
		Robot robot = new Robot();
		robot.mousePress(InputEvent.BUTTON2_DOWN_MASK);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.mouseRelease(InputEvent.BUTTON2_DOWN_MASK);

		// Select year=new Select(driver.findElement(By.id("yearbox")));
		// year.selectByVisibleText("1992");
		// Select day=new Select(driver.findElement(By.id("daybox")));
		// day.selectByVisibleText("22");
		driver.findElement(By.id("firstpassword")).sendKeys("Vijay@123");
		driver.findElement(By.id("secondpassword")).sendKeys("Vijay@123");

		driver.findElement(By.id("submitbtn")).click();

		/*
		 * driver.navigate().to("https://google.com");
		 * driver.switchTo().newWindow(WindowType.TAB);
		 * driver.get("https://www.facebook.com");
		 */

		/*
		 * driver.navigate().to("https://www.goibibo.com"); String title =
		 * driver.getTitle(); System.out.println(title); String url =
		 * driver.getCurrentUrl();// get current uel of a page System.out.println(url);
		 * Navigation nav = driver.navigate(); System.out.println(nav); //
		 * org.openqa.selenium.remote.RemoteWebDriver$RemoteNavigation@773e2eb5
		 * nav.to("https://www.facebook.com"); nav.back();// to perform back operation
		 * nav.forward();// to perform forword operation nav.refresh();// to refresh
		 * page //driver.close(); Options option=driver.manage();
		 * option.deleteAllCookies(); Timeouts time=option.timeouts();
		 * time.implicitlyWait(Duration.ofSeconds(10));
		 * time.pageLoadTimeout(Duration.ofSeconds(10)); Window win=option.window();
		 * win.fullscreen(); win.maximize();
		 */

	}

}
