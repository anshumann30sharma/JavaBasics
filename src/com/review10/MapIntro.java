package com.review10;


import java.util.*;
import java.util.Map.Entry;

public class MapIntro {
	//                                       Map
//	HashMap | LinkedHashMap | TreeMap  |  HashTable
	public static void main(String[] args) {
		Map<Integer,String>phoneBook=new HashMap<>();
		phoneBook.put(123456, "John Smith");
		phoneBook.put(6879458, "James London");
		phoneBook.put(54678, "Rohani Smith");
		phoneBook.put(222000, "Donald Trump");
		phoneBook.put(9998877, "Obama");
		phoneBook.put(23346, "Brad Pitt");
		phoneBook.put(8888888, "John Smith");
		
		String name=phoneBook.get(6879458);
		System.out.println(name+ "  is calling");
		
		String name2=phoneBook.get(99999);
		System.out.println(name2+ "  is calling");
		
		boolean contains=phoneBook.containsKey(5556677);
		System.out.println(5556677+ " is in the map:  "+contains);
		
		boolean contains2=phoneBook.containsValue("Julia Roberts");
		System.out.println("Julia Roberts is in my contacty list:  "+ contains2);
		
		System.out.println(phoneBook);
		
		phoneBook.isEmpty();
		
		/////////////////////////////
		// Let's get all the keys and store them  in a Set
		System.out.println("----------------Keys--------------");
		Set<Integer>keys=phoneBook.keySet();
		Iterator<Integer>it=keys.iterator();
		
		while (it.hasNext()) {
			Integer key=it.next();
			String value=phoneBook.get(key);
			System.out.println(key+"->"+value);
		}
		//Let's get all the values and store them in a Collection
		System.out.println("----------------values-------------");
		Collection<String>values=phoneBook.values();
		for(String value:values) {
			System.out.println(value);
		}
		//keys are unique, values can be duplicate
		//Let's get all the entries and store it in a Set
		System.out.println("---------------entrySet-------------");
		Set<Entry<Integer,String>>entries=phoneBook.entrySet();
		for(Entry<Integer,String>entry :entries) {
			//System.out.println(entry);
			Integer key=entry.getKey();
			String value=entry.getValue();
			System.out.println(key+ "-->"+value);
			
		//	System.out.println(entry.getKey()+""+entry.getValue());
		}
		System.out.println("---------------iterator------------");
		//2nd way
		Iterator<Entry<Integer,String>>entryIt=entries.iterator();
		while(entryIt.hasNext()) {
			Entry<Integer,String>entry=entryIt.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
	}

}
