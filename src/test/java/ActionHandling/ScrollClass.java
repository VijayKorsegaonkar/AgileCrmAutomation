package ActionHandling;

import com.agilecrmautomation.BaseClass;

public class ScrollClass extends BaseClass{

	public static void main(String[] args) {
		launchBrowser("chrome");
		driver.navigate().to("https://www.w3schools.com/");
		driver.manage().window().maximize();
		
		
	
	}

}
