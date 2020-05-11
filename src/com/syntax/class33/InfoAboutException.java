package com.syntax.class33;

public class InfoAboutException {

	public static void main(String[] args) {
		String str="Hello";
		
		try {
			char character=str.charAt(10);
			System.out.println(character);
			
		}catch(StringIndexOutOfBoundsException se) {
			//to get info about exception
			//System.out.println(se);name .message about about E where it occurs
		//	se.printStackTrace();name and about E
			System.out.println(se.getMessage());
		}
		System.out.println("-------end of the programme");
	}

}
