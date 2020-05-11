package com.review05;

public class q6 {

	public static void main(String[] args) {
	String str="madam";
	char[] charArray=str.toCharArray();
	String reverse="";
	System.out.println(reverse.isEmpty());
	for(int i=charArray.length-1;i>=0;i--) {
		reverse+=charArray[i];
		
	}
System.out.println("reverse is "+reverse);
System.out.println("word is "+str);
if (str.equals(reverse)) {
	System.out.println("Yes, it is a palindrome");
}else {
	System.out.println("No, it is not a PALINDROME");
}
	}

}
