package com.syntaxclass12;

public class MoreStringFunctions {

	public static void main(String[] args) {
		String me="I am a good tester";
		//System.out.println(-------------replace() function----);
		//replace old value with new value
		String newString=me.replace("a","c");
		System.out.println(newString);
		
		me=me.replace("good","great");
				System.out.println(me);
		//if it is not finding matching sequence-->not replace
		me=me.replace("Great","Awsome");
		System.out.println(me);
		
		String car="I have a Toyota";
		car=car.replace("Toyota","Lexus");
		System.out.println(car);
		
		//replaceAll function
		
		String str="Phone number is 1234567890";
		
		str=str.replaceAll("a-z","");
		System.out.println(str);
		
		
		String str1="Hello12347**  !!!89";
		str1=str1.replaceAll("[0-9]", "");
		System.out.println(str1);
		
		str1.replaceAll("[^A-Za-z]", "");
		System.out.println(str1);
		
		String str3="Hello All Students";
		str3=str3.replace(" ","");
		System.out.println(str3);
		
		String subject="java";
		subject=subject.replace("a","e").replace("J","I").toUpperCase();
		System.out.println(subject);
		
	}

}
