package ActionHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.agilecrmautomation.BaseClass;

public class RbiHoliday extends BaseClass {

	public static void main(String[] args) {

		launchBrowser("chrome");
		driver.navigate().to("https://www.rbi.org.in/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1500)");
		driver.findElement(By.xpath("//ul[@class='footerlist']//a[contains(text(),'Holidays')]")).click();
		WebElement city = driver.findElement(By.xpath("//div[@id='example-one']/select[1]"));
		Select select = new Select(city);
		select.selectByVisibleText("Mumbai");
		WebElement month = driver.findElement(By.xpath("//div[@id='example-one']/select[2]"));
		Select select1 = new Select(month);
		select1.selectByIndex(0);
		driver.findElement(By.xpath("//input[@id='btnGo']")).click();

		List<WebElement> holidays = driver
				.findElements(By.xpath("(//table[@class='tablebg'])[3]/tbody/tr/td[not(@align='center')]"));
		for (WebElement days : holidays) {

			String day = days.getText();
			if (!day.equals(".")) {
				System.out.print(day);

			}
			

		}

	}

}
