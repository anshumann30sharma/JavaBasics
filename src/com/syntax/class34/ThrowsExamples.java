package com.syntax.class34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsExamples {

	public static void main(String[] args)   {
	multipleSleep();
	try {
	read("");
	}catch(FileNotFoundException e) {
		e.printStackTrace();
	}
	System.out.println("------------end of the code-----");
	
	}
	public static void read(String filePath) throws FileNotFoundException {
		FileInputStream fis=new FileInputStream(filePath);//exception occurred
		
	}
	public static void multipleSleep()  {
		try {
		sleep();
	}catch(InterruptedException e) {
		e.printStackTrace();
	}	
	}
	public static void sleep() throws InterruptedException {
		Thread.sleep(2000);;
		
	}
}