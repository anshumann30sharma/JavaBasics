package com.syntex.class29;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class Main{
	public static void main(String[] args) {
		/*Create a Linked List that will store Integer Objects from 50-100.
Once Linked List is created remove all numbers that are not divisible by 3.

Print Linked List

Expected Output
[51, 54, 57, 60, 63, 66, 69, 72, 75, 78, 81, 84, 87, 90, 93, 96, 99]
*/
		List<Integer>obj=new LinkedList<>();
		for(int i=50;i<=100;i++){
		//	(List class obj).add(i);
			System.out.println(i);
			}
		for(int i=50;i<=100;i++){
			//if(i/3) {
				obj.remove(i);
		//	}else {
				System.out.println(i);
			}
		}
//LinkedList<Integer>obj=new LinkedList<>();
//obj.add(i);


	

	
	

	}

