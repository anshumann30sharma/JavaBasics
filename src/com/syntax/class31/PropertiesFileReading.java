package com.syntax.class31;
//shortcut for import ctrl+shift+o// for mac command +shift +o
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesFileReading {

	public static void main(String[] args) throws IOException {
		// To read the file :
		//have file
		String filePath="C:\\Users\\anshu\\eclipse-workspace\\JavaBasics\\configs\\Examples.properties";
		//2.bring object of FileInputStream
		FileInputStream fileInput=new FileInputStream(filePath);
		
		// to handle data from property file we need property Class
		Properties prop=new Properties();
		prop.load(fileInput);
		String name=prop.getProperty("name");
		System.out.println(name);
		
		String city=prop.getProperty("city");
		System.out.println(city);
		
		String lastName=prop.getProperty("lastName");
		System.out.println(lastName);
		
		Set<Object>keys=prop.keySet();
		for(Object key:keys) {
			System.out.println(key);
			
		}
		
}
}