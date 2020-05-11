package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class TaskWord {

	public static void main(String[] args) {
		//Create an arrayList of words. Remove every word that ends with “e”. Use iterator

		ArrayList <String> words = new ArrayList<>();

		words.add("Water");
		words.add("inorganic");
		words.add("substance");
		words.add("hydrosphere");
		words.add("fluid");
		words.add("comprehensive");
		words.add("organisms");
		words.add("life");
		words.add("calories");
		words.add("temperature");

		System.out.println("All Word List:");
		System.out.println(words);
		System.out.println("---------------------------------------------");

		Iterator <String> word = words.iterator();

		while(word.hasNext()) {
			if (word.next().endsWith("e"))
				word.remove();	
		}

		System.out.println("Word List without word that ends with \"e\": ");
		System.out.println(words);

		}


	}


