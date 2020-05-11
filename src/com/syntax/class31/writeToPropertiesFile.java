package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class writeToPropertiesFile {

	public static void main(String[] args) throws IOException {
		String filePath="C:\\Users\\anshu\\eclipse-workspace\\JavaBasics\\configs\\Examples.properties";
		
		FileInputStream fis=new FileInputStream(filePath);
		Properties prop=new Properties();
		prop.load(fis);
		prop.setProperty("phoneNumber","12345678");
		FileOutputStream fos=new FileOutputStream(filePath);
			prop.store(fos, "Added additional key");
				
		
		
		
		

	}

}
