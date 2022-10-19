package windowhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.agilecrmautomation.BaseClass;

public class DropDown extends BaseClass {

	public static void main(String[] args) {
		launchBrowser("chrome");
		  
		 driver.navigate().to("https://demo.automationtesting.in/Register.html");
		 driver.manage().window().maximize();
	WebElement skills=	driver.findElement(By.xpath("//select[@id='Skills']"));
		Select select=new Select(skills);
		select.selectByVisibleText("Android");
		

	}

}
