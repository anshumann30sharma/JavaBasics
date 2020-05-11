package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TaskProperties {

	public static void main(String[] args) throws IOException {
		String filePath="C:\\Users\\anshu\\eclipse-workspace\\JavaBasics\\configs\\Task.Properties";
		System.out.println(filePath);
		
		String userDirectory=System.getProperty("user.dir");
		System.out.println(userDirectory);
		
		String username=System.getProperty("user.name");
		System.out.println(username);
		
		String os=System.getProperty("os.name");
		System.out.println(os);
		String filePath1=System.getProperty("user.dir")+"\\configs\\Task.Properties";
		
		
		FileInputStream fileInput=new FileInputStream(filePath);
		Properties prop=new Properties();
		prop.load(fileInput);
		String browser=prop.getProperty("browser");
		System.out.println(browser);
		
		String url=prop.getProperty("url");
		System.out.println(url);
		System.out.println(prop.getProperty("url"));
		
			
	}

}
