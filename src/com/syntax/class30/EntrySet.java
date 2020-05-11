package com.syntax.class30;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class EntrySet {

	public static void main(String[] args) {
		/* Create a map of countries with its capital that will store countries
		 *  in alphabetical order.
		Print all keys and values from a country map
		 using for each loop and iterator.
		Print all values from a country map 
		using for each loop and iterator.
		*/
		Map<String,String>countries=new TreeMap<>();
		countries.put("India","New Delhi");
		countries.put("USA","Washington");
		countries.put("Germany","Berlin");
		countries.put("Japan","Tokyo");
		System.out.println(countries);
		System.out.println("______keys using for each loop");
		//storing all entry objects
		Set<Entry<String,String>>allEntries=countries.entrySet();
		System.out.println(allEntries);
		
		//loop through all entries
		for(Entry<String,String>entr:allEntries) {
			System.out.println(entr.getKey());
			System.out.println(entr.getValue());
			String key=entr.getKey();
			String value=entr.getValue();
			System.out.println(key+"__"+value);
					
		}
		//loop through all entries--iterator
		Iterator<Entry<String,String>>entryIterator=allEntries.iterator();
		while(entryIterator.hasNext()) {
			Entry<String,String>e=entryIterator.next();
			String keyvalue=e.getKey()+":::"+e.getValue();
			System.out.println(keyvalue);
			
		}
		
		//create a map in which we store all previous items in ascending order
				//Map<String,String>countries=new TreeMap<>();
				//countries.putAll(household);
			//	System.out.println(shopping);
				
				//get all keys using loop
			//	for(String key:countries.keySet()) {
				//	System.out.println("Key: "+key);	
				}
				//get all keys using iterator
			//	Iterator<String> it=countries.keySet().iterator();
				//while(it.hasNext()) {
		//		System.out.println("Key="+it.next());
				
		//	}
				//get all values using loop
			//	for(int val:capitals.values()) {
			//		System.out.println("Values: "+val);
			//	}
				//get all values using iterator
			//	Iterator<Integer>iterator=shopping.values().iterator();
			//	while(iterator.hasNext()) {
			//		System.out.println("Key="+iterator.next());
						
		
	

	}
