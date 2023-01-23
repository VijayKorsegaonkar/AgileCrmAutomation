package windowhandling;

import org.openqa.selenium.By;

import com.agilecrmautomation.BaseClass;

public class Sample1 extends BaseClass {

	public static void main(String[] args) {
		launchBrowser("chrome");
		driver.navigate().to("https://www.saucedemo.com");
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		

	}

}
