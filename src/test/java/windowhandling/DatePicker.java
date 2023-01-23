package windowhandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.agilecrmautomation.BaseClass;

public class DatePicker extends BaseClass {

	public static void main(String[] args) {
		launchBrowser("chrome");

		driver.navigate().to("https://demo.automationtesting.in/Datepicker.html");
		driver.findElement(By.xpath("//input[@id='datepicker1']")).click();

	List<WebElement> date=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
	for(WebElement selectDate:date) {
	
		
		
		System.out.println(selectDate.getText());
		
		if(selectDate.getText().equals("27")) {
			selectDate.click();
		}
	}

	}

}
