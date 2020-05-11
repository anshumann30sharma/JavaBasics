package com.syntax.class33;

import java.io.FileInputStream;

public class FinallyBlock2 {

	public static void main(String[] args) {
		String file=System.getProperty("user.dir")+"/configs/Examples.properties";
		try {
			FileInputStream fis=new FileInputStream(file);	//new FileNotFoundException()	
	}catch(Exception e) {
		System.out.println("I am a catch blick");
	}finally {// always gets executed
		System.out.println("I am a finally block");
	}

}
}
