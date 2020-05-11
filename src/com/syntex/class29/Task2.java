package com.syntex.class29;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

//Create a Set of cities in which you want to make sure that insertion order is maintained. 
//Using Iterator remove any city that starts with “A”;
public class Task2 {

	public static void main(String[] args) {
		Set<String>cities=new LinkedHashSet<>();
		cities.add("New York");
		cities.add("New Delhi");
		cities.add("Moscow");
		cities.add("Berlin");
		cities.add("Amsterdam");
		
		
		Iterator <String> it= cities.iterator();
		while (it.hasNext()) {
			String element= it.next();
			if (element.startsWith("A")) {
				it.remove();
			}
		}
		System.out.println(cities);
		
		
		
	}

		
		

	}


