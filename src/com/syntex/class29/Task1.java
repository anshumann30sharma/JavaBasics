package com.syntex.class29;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import com.syntax.class28.Insurance;

//Create a Set collection in which you need to add names of the countries.
//In this set we want all objects to be sorted in alphabetical order.
//Using 2 different ways retrieve all elements from set.
public class Task1 {

	public static void main(String[] args ) {
	
		Set<String>countries=new LinkedHashSet<>();
		countries.add("India");
		countries.add("USA");
		countries.add("Bangladesh");
		countries.add("Germany");
		
		System.out.println(countries);
		 for(String str : countries) {
	            System.out.println(str);
	        }
	        System.out.println("----------");
	        Iterator<String> itr = countries.iterator();
	            while(itr.hasNext()) {
	                System.out.println(itr.next());
	            }
	    }
	}
