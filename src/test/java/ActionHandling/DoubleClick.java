package ActionHandling;

import com.agilecrmautomation.BaseClass;

public class DoubleClick extends BaseClass {

	public static void main(String[] args) {
		launchBrowser("chrome");
		driver.navigate().to("https://www.vistra.com/");
		driver.manage().window().maximize();
		

	}

}
