package com.screenshots;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;

import com.agilecrmautomation.BaseClass;

public class class1 extends BaseClass {

	public static void main(String[] args) throws IOException {
		
		launchBrowser("chrome");
		driver.navigate().to("https://jet2traveltech.com/");
		driver.manage().window().maximize();

		WebElement login = driver.findElement(By.xpath("//div[@class='logo']"));
		File screenshot = login.getScreenshotAs(OutputType.FILE);

		SimpleDateFormat simple = new SimpleDateFormat("yyMMdd_HHmmss");
		String format = simple.format(new Date());

		File file = new File(".//screeshot//image" + format + ".png");
		FileUtils.copyFile(screenshot, file);

	}

}
