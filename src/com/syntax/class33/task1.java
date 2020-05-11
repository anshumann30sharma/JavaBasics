package com.syntax.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.channels.AlreadyBoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class task1 {

	public static void main(String[] args) {
		List<Exception>list=getAllExceptions();
		System.out.println(list.size());
		
		Iterator<Exception>eit=list.iterator();
		while(eit.hasNext()) {
			String message=eit.next().getMessage();
			System.out.println(message);		
		}	
	}
		
	public static List<Exception>getAllExceptions(){
		List<Exception>exceptionlist=new ArrayList<>();
		int[] array= {1,2,4};
		try {
			System.out.println(array[2]);
		}catch(AlreadyBoundException aob ) {
			exceptionlist.add(aob);
	
		try {
			Object ob=new Double(50);
			Integer i=(Integer) ob;
		}catch(ClassCastException e) {
			exceptionlist.add(e);
		}
		int a=10;
		int b=0;
		try {
			System.out.println(a/b);			
		}catch(ArithmeticException ae) {
			exceptionlist.add(ae);
		}
		String fpath="";
		try {
			FileInputStream fis=new FileInputStream(fpath);		
		}catch(FileNotFoundException fne) {
			exceptionlist.add(fne);
	}
		
		
	
		
		return exceptionlist;
	}
		return exceptionlist;
	}
}
