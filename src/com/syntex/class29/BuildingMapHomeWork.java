package com.syntex.class29;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class BuildingMapHomeWork {

	public static void main(String[] args) {
		/*(Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values. 
		1.Check how many entries you have?
		2.Update company on a 4th floor 
		3.Remove company on the 7th floor
		4.Print your map
		*/
	
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
				System.out.println(building+"\n");
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
					 System.out.printf(entry.getKey()+", ");
				 }
			}
		}