package com.system.GroupHW;

public class TestWebDriver {

	public static void main(String[] args) {
		//String title;
		RemoteWebDriver driver=new ChromeDriver();
		RemoteWebDriver driver1=new FirefoxDriver();
		RemoteWebDriver driver2=new SafariDriver();
		RemoteWebDriver[] obj= {driver,driver1,driver2};
		for (RemoteWebDriver arr:obj) {
			arr.open();
			String title=arr.getTitle();
			System.out.println(title);
			arr.navigate();
			arr.getScreenshot();
			arr.close();
			System.out.println("================================");
		}
       //2nd Way
       		for(int i=0;i<obj.length;i++) {
			obj[i].open();
			String str=obj[i].getTitle();
			System.out.println(str);
			obj[i].navigate();
			obj[i].getScreenshot();
			obj[i].close();
			System.out.println("==========================");
		//	int i=10;
		}
	}
}

class ChromeDriver implements RemoteWebDriver{

	@Override
	public void open() {
		System.out.println("Chrome Browser opens");
	}
	
	@Override
	public void close() {
		System.out.println("Chrome Browser has closed");
	}
	@Override
	public String getTitle() {
		String getTitle="www.syntaxtechs.com";
		return getTitle;
	}
	@Override
	public void getScreenshot() {
		System.out.println("Screenshot has been taken");
	}
	
	public void navigate() {
		System.out.println("Navigating web page");
	}
}
class FirefoxDriver implements RemoteWebDriver{
	String baseUrl;
	
	public void open() {
		System.out.println("Firefox Browser opens");
	}
	
	public void close() {
		System.out.println("Firefox Browser has closed");
	}

	public String getTitle() {
		String getTitle="www.syntaxtechs.com";
		return getTitle;
	}

	public void getScreenshot() {
		System.out.println("Screenshot has been taken");
	}
	
	public void navigate() {
		System.out.println("Navigating web page");
	}
}
class SafariDriver implements RemoteWebDriver{
	String baseUrl;

	public void open() {
		System.out.println("Safari Browser opens");
	}

	public void close() {
		System.out.println("Safari Browser has closed");
	}

	public String getTitle() {
		String getTitle="www.syntaxtechs.com";
		return getTitle;
	}

	public void getScreenshot() {
		System.out.println("Screenshot has been taken");
	}

	public void navigate() {
		System.out.println("Navigating web page");
	}
}