package com.agilecrmautomation;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.agilecrm.pages.DealsPage;
import com.agilecrm.pages.LoginPage;

public class DealsTestCase extends BaseClass {

	static DealsPage Deals = new DealsPage();

	@BeforeClass
	
	public void A_login(){
		
		launchBrowser("chrome");
		driver.navigate().to("https://cyberworld.agilecrm.com/");
		LoginPage login=new LoginPage();
		login.login("vijayraj@yopmail.com", "Vijay@1234");
		System.out.println("login successfully");
	}

@Test
	public void Dealscreate() throws Exception {
		for (int i = 1; i <= 10; i++) {
			String name = ("Deal" + i);
			String price = ("10000" + i);
			Deals.Adddeals(name, price);
			System.out.println("create deal successfully");
		}
	}

	@Test
	public void changestatus() throws Exception {
		Deals.changeDealsStatus("New", "Won", "1");
		System.out.println("change deal status successfully");
	}


	}


