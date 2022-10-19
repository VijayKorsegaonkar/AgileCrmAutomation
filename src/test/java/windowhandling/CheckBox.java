package windowhandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.agilecrmautomation.BaseClass;

public class CheckBox extends BaseClass {

	public static void main(String[] args) {
		
		launchBrowser("chrome");

		driver.navigate().to("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//span[contains(text(),'HTML')]")).click();
		List<WebElement> all=driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container')]/li[not(@class='multiselect-item multiselect-group')]"));
for(WebElement element:all) {
	System.out.println(element.getText());
	if(!(element.findElement(By.tagName("input")).isSelected())) {
		element.click();
		
	}
}
	}

}
