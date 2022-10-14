package com.agilecrmautomation;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.agilecrm.pages.LinksPage;

public class LinkVerification extends BaseClass {

	@BeforeTest(groups= {"regression"})
	public void amazon(){
		launchBrowser("chrome");
		driver.navigate().to("https://www.amazon.in/");
	}
	@Test(groups= {"regression"})
	public void amazonLinks()
	{
		LinksPage links=new LinksPage();
		links.getLinksOfAmazon();
		
		
		
	}

}
