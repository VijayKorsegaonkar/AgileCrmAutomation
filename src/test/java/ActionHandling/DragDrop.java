package ActionHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.agilecrmautomation.BaseClass;

public class DragDrop extends BaseClass {

	public static void main(String[] args) {
		launchBrowser("chrome");
		driver.navigate().to("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		Actions act=new Actions(driver);
		driver.switchTo().frame(frame);
		act.clickAndHold(drag).moveToElement(drop).release().perform();
		
	}

}
