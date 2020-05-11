package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;



public class ArrayListAndIterator {

	public static void main(String[] args) {
		// let's create an ArrayList of Chocolate
		ArrayList<String>choco=new ArrayList<>();
		choco.add("kinder");
		choco.add("godiva");
		choco.add("kit kat");
		choco.add("snikers");
		
		// create ArrayList of sweets
		ArrayList<String>sweets=new ArrayList<>();
		sweets.add("ice cream");
		sweets.add("cheese cake");
		sweets.addAll(choco);
		System.out.println(sweets.size());
		System.out.println(sweets);
		
		//we want to iterate through collection
		Iterator<String>it=sweets.iterator();
		//iterates in one direction
		
		while(it.hasNext()) {//iterates one by one, with "if" it does only one
			String element=it.next();
		//	System.out.println(element);
			if(element.equals("ice cream")){
					it.remove();
			}
			}
		System.out.println("ArrayList after removing element");
		System.out.println(sweets);
		//I want to get elements backwards
		for(int i=sweets.size()-1;i>=0;i--) {
			System.out.print(sweets.get(i)+";");
		}
		//advanced for loop
		//iterates in one direction
		for(String str:sweets) {
			System.out.println(str);
		}
		

	}

}
