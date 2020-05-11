package com.system.GroupHW;

import java.util.ArrayList;
import java.util.Iterator;
//Create an arrayList of drinks. 
//If any drink has letter “a” or “e” replace it with water. 
public class Drinks {

	public static void main(String[] args) {
		ArrayList<String>drinks=new ArrayList<>();
		drinks.add("Pepsi");
		drinks.add("Coke");
		drinks.add("Beer");
		drinks.add("Lemon");
		
		System.out.println(drinks);
		
		
		for (String s:drinks) {
			s=s.toLowerCase();
			if (s.contains("a")||s.contains("e")) {
			s=s.replaceAll(s, "water");
			}
			System.out.println(s);
	}
		
//drinks,set(s,"water);
		//for(int i=0;i<drinks.size();i++){
		//if(drinks.
	/*ArrayList<String>drinks=new ArrayList<>();
		drinks.add("Pepsi");
		drinks.add("Coke");
		drinks.add("Beer");
		drinks.add("Lemon");
		drinks.add("Lemon");
		drinks.add("Beer");
	 * 	for(int i=0;drinks.size();i++){
	 * if(drinks.equals("beer")||drinks.equals("Lemon")){
	 * drinks.remove(i);
	 * }}
	 * System.out.println(drinks);
	 */
}
}
