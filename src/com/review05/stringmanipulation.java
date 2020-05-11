package com.review05;

public class stringmanipulation {

	private static String starts;

	public static void main(String[] args) {
		String str="Hello ";
		
System.out.println(str.length());
System.out.println(str.toUpperCase());

//str has not changed
System.out.println(str);
System.out.println(str.toLowerCase());

str.equals("Hello");
System.out.println(str.equalsIgnoreCase("hello"));
//method chaNGE
starts =str.toLowerCase();str. startsWith("he");
System.out.println(starts);

	
String reverse=" ";
char[]charArray=str.toCharArray();
for (int i=charArray.length-1;i>=0;i--);
//System.out.println(charArray[i]);
// reverse+=charArray[i];

	
	System.out.println("reverse is "+reverse);
	

}

}	
		
	

	
		
	
