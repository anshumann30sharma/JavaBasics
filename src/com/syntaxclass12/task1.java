package com.syntaxclass12;

public class task1 {

	public static void main(String[] args) {
		//create a String and print it in reverse order
		//(Sunday-->yadnuS).
		String str = "Sunday";
		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		System.out.print("Reversed string is:");
		System.out.println(reverse);
	}




	}


