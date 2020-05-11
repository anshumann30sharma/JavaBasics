package com.syntax.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.commons.compress.archivers.ArchiveException;

public class HandleEsception {

	public static void main(String[] args) throws ArchiveException {
		try {
	Thread.sleep(2000);
	}catch(InterruptedException e) {
		
	}
		System.out.println("Continue to next try block");
		
		String fPath="";
		try {
			FileInputStream fis=new FileInputStream(fPath);
		}catch(FileNotFoundException fne) {
			System.out.println("Catched FileNotFoundException Exception");
		}
		System.out.println("Continue to next try block");
		
		int a=10;
		int b=0;
		try {
			System.out.println(a/b);
			System.out.println("I am code inside block");// ignored is not executed, as there is no loop
		}catch(ArithmeticException ae) {
			System.out.println("Catched ArithmeticException Exception");
		}
		System.out.println("End of Programme");
}
}