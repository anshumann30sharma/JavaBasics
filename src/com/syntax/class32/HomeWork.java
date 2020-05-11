package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class HomeWork {

	public static void main(String[] args) throws IOException {
		WebDriver driver=null;
		String filePath="C:\\Users\\anshu\\eclipse-workspace\\JavaBasics\\configs\\Task.Properties";
		FileInputStream  fis=new FileInputStream(filePath);
		
		Properties prop= new Properties();
		prop.load(fis);
		String browser=prop.getProperty("browser");
		switch(browser) {
		case"google":
		System.setProperty("webdriver.chrome.driver"," Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		break;
		case"firefox":
			System.setProperty("webdriver.gecko.driver"," Driver\\geckodriver.exe");
			driver=new FirefoxDriver();
			break;
		
		
		
		
		
				
		
		

	}

	}
}
