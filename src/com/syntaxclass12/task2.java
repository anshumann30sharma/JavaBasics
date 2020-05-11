package com.syntaxclass12;

public class task2 {

	public static void main(String[] args) {
		// create a string and if the string is not empty,
		//if the String has an odd number of 
		//characters and has 3 or more 
		//characters, print the character in the
		//middle of the String.
		String str= "Morning";
		int index=str.length();
		if(!str.isEmpty()) {
			if ((index%2!=0) && index>=3 ) {
				System.out.println(str.charAt(index/2));
			}
		}else {
			System.out.println("String is Empty");
		}
	}

}
