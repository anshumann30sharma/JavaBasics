package com.syntex.class29;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class HashSetDemo {

	public static void main(String[] args) {
		//create a collection that stores only unique objects
		//doesn't care about order
		HashSet<String>breakfast=new HashSet<>();
		breakfast.add("Eggs");
		breakfast.add("bread");
		breakfast.add("Tea");
		breakfast.add("Eggs");
		breakfast.add("Coffe");
		
		//how many elements in the set?
		int size=breakfast.size();
		System.out.println(size);
		//order is not maintained
		System.out.println(breakfast);
		
		//retrieve an element--no get method available
		// we can retrieve all elements!
		Iterator<String> myIterator=breakfast.iterator();
		while(myIterator.hasNext()) {
		System.out.println(myIterator.next());
	}
		
		//we cannot use forloop
		//advanced for loop/for each loop
		for(String item:breakfast) {
			System.out.println(item);
		}
		
	}	


}
