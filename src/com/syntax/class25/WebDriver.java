package com.syntax.class25;
interface TakesScreenShot{
	String fileExtension=".png";
	void takePicture();
	//below features introduced in Java8
	static void takeSelfie() {
		System.out.println("can take a selfie");
		
	}
	default void takePanoramaPic() {
		System.out.println("I can take panaromic pictures");	
	}
}
public interface WebDriver {
	void openBrowser();
	void closeBrowser();
	void maximizeWindows();
	void findElement();
	void get(String property);

}
class ChromeDriver implements WebDriver,TakesScreenShot{
	public void openBrowser() {
		System.out.println("ChromeDriver opens Browser");				
	}
	public void closeBrowser() {
		System.out.println("ChromeDriver closes browser");
	}
	public void maximizeWindows() {
		System.out.println("ChromeDriver maximizes Windows");
	}
	public void findElement() {
		System.out.println("ChromeDriver finds element");	
	}
	public void takePicture() {
		System.out.println("ChromeDriver takes Pictures");
	}
	@Override
	public void get(String property) {
		// TODO Auto-generated method stub
		
	}
}
class FirefoxDriver implements WebDriver{
	public void openBrowser() {
		System.out.println(" FirefoxDriver opens browser");
	}
	public void closeBrowser() {
		System.out.println("FirefoxDriver closes browser");
	}
	public void maximizeWindows() {
		System.out.println("FirefoxDriver maximizes Windows");
	}
	public void findElement() {
		System.out.println("FirefoxDriver finds element");
		
}
	@Override
	public void get(String property) {
		// TODO Auto-generated method stub
		
	}
}