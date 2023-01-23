package com.screenshots;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.agilecrmautomation.BaseClass;

public class Class3 extends BaseClass {

	public static void main(String[] args) throws IOException {
		
		launchBrowser("chrome");
		driver.navigate().to("http://demo.sentrifugo.com/index.php/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		TakesScreenshot screeshot = (TakesScreenshot) driver;
		File file = screeshot.getScreenshotAs(OutputType.FILE);
		SimpleDateFormat simple = new SimpleDateFormat("yyMMdd_HHmmss");
		String format = simple.format(new Date());
		File file1 = new File(".//screeshot//image" + format + ".png");
		FileUtils.copyFile(file, file1);
		

	}

}
