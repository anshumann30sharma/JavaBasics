package com.syntax.class13;

public class q4 {

	public static void main(String[] args) {
		// alpha characters
		String str="Hig99 8&%";
			str.replaceAll("[^A-Za-z]","");
		int number=str.length();
		System.out.println("Number of alpha charcter= "+number);
		
		String myString="today is wednesday";
	String[]	array=myString.split(" ");
		
	int words=array.length;
	System.out.println("Total words in string:"+myString+"="+words);
	
	}
}
