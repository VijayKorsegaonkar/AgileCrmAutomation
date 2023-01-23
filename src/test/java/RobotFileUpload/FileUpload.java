package RobotFileUpload;

import com.agilecrmautomation.BaseClass;

public class FileUpload extends BaseClass {

	public static void main(String[] args) {
		launchBrowser("chrome");
		driver.navigate().to("https://the-internet.herokuapp.com/basic_auth");
		driver.manage().window().maximize();
		
		
		
		//https://the-internet.herokuapp.com/basic_auth


	}

}
