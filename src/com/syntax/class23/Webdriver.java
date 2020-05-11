package com.syntax.class23;

public class Webdriver {
public void open() {
	System.out.println("Opening browser");
	
}
}
class FirefoxDriver extends Webdriver{
	public void open() {
		System.out.println("Opening FirefoxDriver");
	}
}class ChromeDriver extends Webdriver{
	public void open() {
		System.out.println("Opening Chrome browser");
	}
}
class InternetExplorerDriver extends Webdriver{
	public void open() {
		System.out.println("Opening InternetExplorerDriver browser");
	}
}