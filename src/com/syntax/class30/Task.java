package com.syntax.class30;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Task {

	public static void main(String[] args) {
		/* Create a map of Best Buy store. Place
		item id and item name into it. 
		Example (7664847 = Printer, 7879885= TV etc )

		Retrieve all keys and values from a Best Buy map using EntrySet.
*/
		Map<Integer,String>items=new TreeMap<>();
		items.put(1234,"Printer");
		items.put(4567,"Mouse");
		items.put(8981,"LapTop");
		items.put(1222,"TV");
		
		System.out.println(items.size());
		//get all entries from a map
				Set<Entry<Integer,String>>entries=items.entrySet();
				System.out.println(entries);
				
				//loop through all entry objects
				for(Entry e:entries) {
					System.out.println(e.getKey()+":"+e.getValue());
					
				}
				//iterator through all entry objects
				Iterator<Entry<Integer,String>>it=entries.iterator();
				while(it.hasNext()) {
				//	System.out.println("Key="+it.next().getKey()+" value= "+it.next().getValue());
					Entry<Integer,String>entry=it.next();
					System.out.println("Key "+entry.getKey()+"==value "+entry.getValue());
				}
				
				
			}

		

		
		
		
	}


