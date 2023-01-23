package windowhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.agilecrmautomation.BaseClass;

public class Jet2Date extends BaseClass {

	public static void main(String[] args) {
		launchBrowser("chrome");

		driver.navigate().to("https://www.jet2.com/");
		WebDriver driver=new ChromeDriver();
		WebElement element=driver.findElement(By.id(""));


	}

}
