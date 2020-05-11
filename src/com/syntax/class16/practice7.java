package com.syntax.class16;

public class practice7 {
	/*Create a static method with the following specification

Return Type: String
Method Name: mixString
Parameters:


Then inside method write logic that will return the strings combined,
 one letter at a time, starting with s1.  See example below for an example.  

NOTE: s1 and s2 should be of equal lengths:

s1 ==> "12345"
s2 ==> "abcde"
mixString(s1,s2) ==> "1a2b3c4d5e"
*/
	
	static String mixstring(String s1,String s2) {
		
			String mix="";
			 // 1st way
			for(int a=0;a<s1.length();a++) {
				mix=mix+s1.charAt(a)+s2.charAt(a);//concatenation of string characters
			}
	          return mix;
	}	
	

	public static void main(String[] args) {
		 String firstValue = mixstring("12345","abcde"); 
			System.out.println(firstValue); 
			String secondValue = mixstring("howdy","hello");
			System.out.println(secondValue); 
		
	
	}

}
