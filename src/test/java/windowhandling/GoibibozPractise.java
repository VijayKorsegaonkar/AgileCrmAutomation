package windowhandling;

import java.time.LocalDateTime;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.agilecrmautomation.BaseClass;

public class GoibibozPractise extends BaseClass {

	public static void main(String[] args) {
		launchBrowser("chrome");
		driver.navigate().to("https://www.goibibo.com/");
		driver.findElement(By.xpath("//span[contains(text(),'Departure')]")).click();
		
		List<WebElement> date=driver.findElements(By.xpath("//div[@class='DayPicker-Caption']/following-sibling::div//p"));
		for(WebElement selectDate:date) {
			if(!(selectDate.getAttribute("class").contentEquals("DayPicker-Day--disabled"))) {
				System.out.println(selectDate.getText());
				if(selectDate.getText().equals(LocalDateTime.now())) {
					selectDate.click();
					break;
				}
			}
			
		}

	}

}
