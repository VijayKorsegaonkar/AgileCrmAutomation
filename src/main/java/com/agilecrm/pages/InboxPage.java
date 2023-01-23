package com.agilecrm.pages;

public class InboxPage {
	public static void main(String[] args) {
		
	
	
	int[][] i=new int[5][5];
	System.out.println(i);
	try {
		System.out.println(10/0);
	} catch (Exception e) {
		System.out.println("arithmatic exception");
	}
	
	System.out.println(10.0/0);
	System.out.println(0/0);
	System.out.println(0.0/0.0);
	}
}
