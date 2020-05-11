package com.syntax.class30;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class AllMaps {

	public static void main(String[] args) {
		//lets create a grocery map(item, quantity} in which we do not care about the order
		Map<String,Integer>grocery=new HashMap<>();
		grocery.put("milk",1);
		grocery.put("cucumber",3);
		grocery.put("banana",12);
		grocery.put("cheese",2);
		
		System.out.println(grocery);
//create a map of items to buy, we want to save order
		Map<String,Integer>household=new LinkedHashMap<>();
		household.put("lysol",2);
		household.put("sanitizer",4);
		household.put("papertowel",2);
		household.put("facemask",20);
		System.out.println(household);
		
		//create a map in which we store all previous items in ascending order
		Map<String,Integer>shopping=new TreeMap<>();
		shopping.putAll(household);
		System.out.println(shopping);
		
		//get all keys using loop
		for(String key:shopping.keySet()) {
			System.out.println("Key: "+key);	
		}
		//get all keys using iterator
		Iterator<String> it=shopping.keySet().iterator();
		while(it.hasNext()) {
		System.out.println("Key="+it.next());
		
	}
		//get all values using loop
		for(int val:shopping.values()) {
			System.out.println("Values: "+val);
		}
		//get all values using iterator
		Iterator<Integer>iterator=shopping.values().iterator();
		while(iterator.hasNext()) {
			System.out.println("Key="+iterator.next());
				
}
}
}
