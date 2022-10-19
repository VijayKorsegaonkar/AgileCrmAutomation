package windowhandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.agilecrmautomation.BaseClass;

public class DropDownMultipleselect extends BaseClass {

	public static void main(String[] args) {
		launchBrowser("chrome");

		driver.navigate().to("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@id='msdd']")).click();
		List<WebElement> Languages = driver.findElements(By.xpath("//ul[contains(@class,'ui-autocomplete')]/li/a"));
		for(WebElement laung:Languages) {
			if(laung.equals("Arabic")) {
				laung.click();
			}
			else if( laung.getText().equals("Danish")){
				laung.click();
				
				
			}
			else {
		}

	}

	
	}}
