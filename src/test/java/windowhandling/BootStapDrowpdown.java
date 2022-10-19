package windowhandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.agilecrmautomation.BaseClass;

public class BootStapDrowpdown extends BaseClass {

	public static void main(String[] args) {
		launchBrowser("chrome");

		driver.navigate().to("https://www.automationtestinginsider.com/2019/12/bootstrap-dropdown-example_12.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("bootstrapmenu")).click();
		List<WebElement> bootstrap = driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li"));
		for (WebElement laung : bootstrap) {
			if (laung.getText().equals("HOME")) {
				laung.click();
			}

		}
	}
}
