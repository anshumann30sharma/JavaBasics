package com.syntax.class25;

public class WebDriverTest {

	public static void main(String[] args) {
		ChromeDriver c=new ChromeDriver();
		c.openBrowser() ;
		c.closeBrowser() ;
		c.maximizeWindows();
		c.findElement();
		c.takePicture();
		FirefoxDriver f=new FirefoxDriver();
		f.openBrowser() ;
		f.closeBrowser() ;
		f.maximizeWindows();
		f.findElement();
		
		
	}

}
