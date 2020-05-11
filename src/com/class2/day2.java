package com.class2;

public class day2 {
	public static void main(String[] args) {
	String s1 = "I love Java classes at Syntax";
	String subString1 = s1.substring(s1.indexOf('c'));
	String subString2 = s1.substring(s1.indexOf('I'), s1.indexOf('c')).trim();
	System.out.println(subString1);
	System.out.println(subString2);
}
}
	