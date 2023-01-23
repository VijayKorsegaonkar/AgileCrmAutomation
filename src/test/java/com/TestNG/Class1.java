package com.TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Class1 {

	@Test(priority=1)
	public void test1() {
		
	System.out.println("This is test one method");
	}
	@Test(priority=2,dependsOnMethods="test3")
	public void test2() {
		
		System.out.println("This is test two method");
		}
	@Test(priority=2, dependsOnMethods= "test1")
	public void test3() {
		
		System.out.println("This is test three method");
		}
	@Test(priority=4)
	public void test4() {
		
		System.out.println("This is test four method");
		}
	

}
