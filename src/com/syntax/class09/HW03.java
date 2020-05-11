package com.syntax.class09;

public class HW03 {
public static void main(String[] args) {
	//Create an array of words: Java, Saturday, day, coding, is.
	//Print the following sentence using elements of array:
	//“Saturday is Java coding Day”.
	String[] words= {"Java"," Saturday", "day"," coding"," is"};
	System.out.println(words[1]+" "+words[4]+" "+words[0]+" "+words[3]+" "+words[2]);
	
	//2nd way
	String[] word=new String[5];
	word[0]="day";
	word[1]="Java";
	word[2]="is";
	word[3]="coding";
	word[0]="Saturday";
	System.out.println(words[1]+" "+words[4]+" "+words[0]+" "+words[3]+" "+words[2]);
	
}
}
