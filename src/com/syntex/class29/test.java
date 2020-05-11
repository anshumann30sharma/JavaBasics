package com.syntex.class29;
import java.util.HashMap;
/*Create Hash Map. 
add the follow values

map.put("ONE","AAA");
map.put("TWO","BBB");
map.put("THREE","CCC");
map.put("FOUR","DDD");
map.put("FIVE","EEE");

Using EntrySet print the key and values pairs using iterator only

replace with below key THREE--> ASEL and key FIVE-->SUMAIR

Using EntrySet print the key and values pairs using iterator only

OUTPUT
 
HashMap Before Replace :
FIVE : EEE
ONE : AAA
FOUR : DDD
TWO : BBB
THREE : CCC
------------------
HashMap After Replace :
FIVE : SUMAIR
ONE : AAA
FOUR : DDD
TWO : BBB
THREE : ASEL
*/
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;
 class test {
public static void main(String[] args) {
	HashMap<String,String>map=new HashMap<>();
	map.put("ONE","AAA");
	map.put("TWO","BBB");
	map.put("THREE","CCC");
	map.put("FOUR","DDD");
	map.put("FIVE","EEE");

	Set<Entry<String,String>>allEntries=map.entrySet();

	Iterator<Entry<String,String>>entryIterator=allEntries.iterator();
	while(entryIterator.hasNext()) {
		Entry<String,String>e=entryIterator.next();
		String keyvalue=e.getKey()+" : "+e.getValue();
		System.out.println(keyvalue);
	}
	System.out.println("__________________________________________________");


		map.replace("THREE","ASEL ");
		map.replace("FIVE","SUMAIR ");
		
		Iterator<Entry<String,String>>entryIterator1=allEntries.iterator();
		while(entryIterator1.hasNext()) {
			Entry<String,String>e1=entryIterator.next();
			String keyvalue1=e1.getKey()+" : "+e1.getValue();
			System.out.println(keyvalue1);
}	
}
}
