package com.syntax.class30;


import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapHW {


	public static void main(String[] args) {
		Map<Integer, String> building=new LinkedHashMap<>();
		//Entries with duplicate keys and values;
		building.put(1, "Google");
		building.put(2, "Syntax");
		building.put(3, "Google");
		building.put(4, "Amazon");
		building.put(4, "Amazon");
		building.put(5, "HP");
		building.put(6, "Microsoft");
		building.put(7, "Oracle");
		System.out.println("==Checking how many Entries we have=====");
		System.out.println("The Building has "+building.size()+" floor.");
		//how to get all keys
		Set<Integer>keys=building.keySet();
		System.out.println(building.keySet());
		System.out.println("__________getting iterator___");
		Iterator<Integer>keysIT=keys.iterator();
		while(keysIT.hasNext()) {
			int key=keysIT.next();
			//key is--and its value is
			System.out.println("Key is "+key+" its value is"+building.get(key));			
		}
		System.out.println("__________getting keys using for each loop___");
		for(int k:keys) {
			System.out.println("Key from building map "+k+building.get(k));
		}
		// how to get all values
		
		Collection<String>values=building.values();	//Iterable collection, our bldg is map	
		System.out.println("____________getting all values using for each loop___");
		//map.-->int
	//	int i=building.size();
		for(String v:values) {
			System.out.println("Values from collection "+v);
		}
		System.out.println("________getting all values using iterator___");
		Iterator<String>valuesIt=values.iterator();
		while(valuesIt.hasNext()) {
			System.out.println("Map values: "+valuesIt.next());
		}
		
		
		/*System.out.println(building+"\n");
		System.out.println("===Updating Company on 4th floor===");
		building.replace(4,"Amazon", "IBM");
		System.out.println(building+"\n");
		System.out.println("==Removing company on 7th floor=====");
		//
		building.remove(7, "Oracle");
		System.out.println(building+"\n");
		System.out.println("===Printing building Map======");
		System.out.println(building+"\n");
		System.out.println("===Printing values of building Map(1st Way)======");
		Collection<String> c=building.values();
		for(String s:c) {
			System.out.print(s+", ");
		}
		System.out.println("\n");
		System.out.println("===Printing values of building Map(2nd Way)======");
		 for (Map.Entry<Integer, String> entry : building.entrySet()) {
			 System.out.printf(entry.getValue()+", ");
		 }
		System.out.println("\n");		
		System.out.println("==Printing Floor Number==============");
		System.out.print("Floor numbers of building is: ");
		 for (Map.Entry<Integer, String> entry : building.entrySet()) {
			 System.out.printf(entry.getKey()+", ");*/
		 }
	}
