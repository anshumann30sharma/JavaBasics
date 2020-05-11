package com.syntex.class29;

import java.util.HashMap;
import java.util.Map;

public class MapIntro {

	public static void main(String[] args) {
		//hashmap is not maintain order
	Map<String,String>hmap=new HashMap<>();
	//to store values
	hmap.put("Name", "John");
	hmap.put("Last Name", "Smith");
	hmap.put("Address", "123 test");
	hmap.put("City", "Chantilly");
	//how to check its values?
	boolean isEmpty=hmap.isEmpty();
	System.out.println("Map is empty "+isEmpty);
	//how many elements is Map
	int size=hmap.size();
	System.out.println("Map size is ="+size);
	
	//add more values
	hmap.put("Zip","12345");
	//can we store duplicate keys
	hmap.put("Name", "Jane");
	System.out.println(hmap);
	
	//how access the value?
	System.out.println(hmap.get("Name"));
	
	//remove the value
	hmap.remove("Address");
	System.out.println(hmap);
	//replace values
	hmap.replace("Zip","98745");
	System.out.println(hmap);

	


}
}
