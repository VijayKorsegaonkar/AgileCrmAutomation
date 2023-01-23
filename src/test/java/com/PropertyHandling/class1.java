package com.PropertyHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class class1 {

	public static void main(String[] args) throws IOException {
		File file=new File("./src/test/resource/config.properties");
		System.out.println(file.exists());//to check weather file is present or not
		FileInputStream fos=new FileInputStream(file);
		Properties prop=new Properties();
		prop.load(fos);
		prop.
		System.out.println(prop.getProperty("username"));
	}


}
