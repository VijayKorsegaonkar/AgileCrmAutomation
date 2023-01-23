package calender;

import com.agilecrmautomation.BaseClass;

public class DatePickup extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		launchBrowser("chrome");
		driver.navigate().to("https://www.goibibo.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

	}

}
