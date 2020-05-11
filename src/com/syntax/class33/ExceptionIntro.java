package com.syntax.class33;

import java.io.FileInputStream;

public class ExceptionIntro {

	public static void main(String[] args) {
		int a=10;
		int b=2;
		//System.out.println(a/b);---Arithmetic exception
		
		System.out.println("End of the program");
		
		int[] array= {12,1,13};
		System.out.println(array[3]);//arrayIndexoutof bound exception
		//System.out.println(str.length());--nullpointexception
		NullPointerException npe=new NullPointerException ()
;
		throw(npe);
		//Thread.sleep(2000);
		//FileInputStream fis=new FileInputStream(filePath);
		
		
		
	}
	

}
