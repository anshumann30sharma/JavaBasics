package com.syntax.class31;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapRecap {

	public static void main(String[] args) {
	//let's create map of countries with capitals
	
		Map<String,String>hmap=new HashMap<>();
		hmap.put("USA","Washington DC");
		hmap.put("Russia","Moscow");
		hmap.put("France","Paris");
		hmap.put("Tajikistan","Dushanbe");
		hmap.put("Italy",null);
		hmap.put(null,"some value");
		hmap.put(null,"another value");//duplicate key,previous value being overridden
		hmap.put("Germany",null);
		System.out.println(hmap);
		//how to get all keys from map?keySet(), entrySet();
		System.out.println("------------keys----------------");
		Set<String>keys=hmap.keySet();//use loop or iterator
		Iterator<String>it=keys.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		Set<Entry<String,String>>entries=hmap.entrySet();
		Iterator<Entry<String,String>>iter=entries.iterator();
		while(iter.hasNext()) {
			String key=iter.next().getKey();
			System.out.println(key);
		}		
		//how to get all values? values(); entrySet();
		System.out.println("------------values----------------");
		Collection<String>values=hmap.values();
		it=values.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			//key and values
			
			while(iter.hasNext()) {
				Entry<String,String>entry=iter.next();
				String myEntry=entry.getKey()+"---"+entry.getValue();
			System.out.println(myEntry);
//let's create hashTable		
		Map<String,String>htable=new Hashtable<>();
		htable.put("USA","Washington DC");
		htable.put("Russia","Moscow");
		htable.put("France","Paris");
		htable.put("Tajikistan","Dushanbe");
		//htable.put("Italy",null);//cant store null value
	//	htable.put(null,"some value");//cant store null keys
		System.out.println(htable);	
						
		//first part of code
		createMap("City","Chantilly");
		
		//second part of the code
		createMap("City","Washington DC");
			}
		}
	}
	public static Map<String,String>createMap(String key,String value) {
		Map map=new HashMap<>();
		map.put(key,value);
		return map;
		
	}
}
