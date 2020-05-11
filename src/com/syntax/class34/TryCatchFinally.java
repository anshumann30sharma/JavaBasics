package com.syntax.class34;

import java.io.FileInputStream;

import java.io.IOException;
import java.nio.file.FileSystemNotFoundException;
import java.util.Properties;

public class TryCatchFinally {

	public static void main(String[] args) {
		
division(10,5);
division(10,0);
	}
	public static void division(int num,int num1) {
		int result=0;
		try {
			result=num/num1;
		System.out.println(num/num1);
		}catch(ArithmeticException ae) {
		//	ae.printStackTrace();//detailed message of an exception
			System.out.println(ae.getMessage());//message of an exception
			System.out.println(ae);
		
	}finally {
		System.out.println("I am a finally block");
	}
	}
		public static void read(String filePath) {
			FileInputStream fis=null;
			try {
			fis=new FileInputStream(filePath);
			Properties prop=new Properties();
			prop.load(fis);
			}catch(IOException e) {
				e.printStackTrace();
			}catch(FileSystemNotFoundException e) {
				e.printStackTrace();
			}finally {
				try {
					fis.close();
					
				}catch(IOException e) {
					e.printStackTrace();
				}
				
			}
			
			
		}
}

