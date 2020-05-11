package com.syntax.class13;

public class recap {
public static void main(String[] args) {
	/*
	 * write a programme to swap 2 nos
	 */
	int a=10;
	int b=20;
	a=a+b;//30
	b=a-b;//30-20=10
	a=a-b;
	System.out.println("The value of a= "+a);
	System.out.println("The value of a= "+b);
	
	String str1="Day";
	String str2="Night";
	str1=str1+str2;//DayNight->8
	str2=str1.substring(0,str1.length()-str2.length());//(beginIndex,endingIndex--Day
	str1=str1.substring(str2.length());//Night
	System.out.println("The value of str1= "+str1);
	System.out.println("The value of str2= "+str2);
	//another way
	String s1="hello";
	String s2="Bye";
	String shorterstr1=s1+s2;
	
}

}
