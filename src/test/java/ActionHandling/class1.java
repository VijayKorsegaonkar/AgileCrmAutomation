package ActionHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import com.agilecrmautomation.BaseClass;

public class class1 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		launchBrowser("chrome");
		driver.navigate().to("https://www.vistra.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
		Actions act=new Actions(driver);
		
		/*
		 * act.moveToElement(driver.findElement(By.xpath("//a[@class='has-menu']"))).
		 * build().perform();
		 * driver.findElement(By.xpath("//a[contains(text(),'Board Governance')]")).
		 * click(); act.moveToElement(driver.findElement(By.xpath(
		 * "//span[contains(text(),'Services')]"))).perform();
		 */
		act.moveToElement(driver.findElement("//a[contains(text(),'Client portal')]"));
		
		

	}

}
