package com.syntaxclass12;

public class splitMethods {

	public static void main(String[] args) {
		System.out.println("------split() Function--");
		String today="Today is my favorite Java class";
		String[] array=today.split("my");
		System.out.println(array.length);
		System.out.println(array[0]);
		System.out.println(array[1]);
		
		String today1="Today is my favorite Java class";
		String[] stringArray=today1.split("a");
		//print all elements from array 1 by 1
		//For(element type variableName:name of array)
		for(String arr:stringArray) {
			System.out.print(arr+"|");
		}
		System.out.println("------------");
		//we want to print String word by word
		String today2="Today is my favorite Java class";
		String[] words=today2.split(" ");
		for(int i=0;i<words.length;i++) {
			System.out.println(words[i]);
		}
		//today3=today3.split(""); CE:type mismatch, will give back 
		//array of strings
		
	}

}
