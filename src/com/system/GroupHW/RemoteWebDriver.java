package com.system.GroupHW;

interface WebDriver {
	void open();
	void close();
	String getTitle();
}
interface TakesScreenshot {
	void getScreenshot();
}

public interface RemoteWebDriver extends WebDriver, TakesScreenshot {
	void navigate();
}
	