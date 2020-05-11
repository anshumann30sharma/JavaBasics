package com.system.GroupHW;

import java.util.ArrayList;
import java.util.Iterator;
/* Home Work-4:
Create an arrayList of even numbers from 1 to 50. 
Using Iterator remove any number that is divisible by 5 from that arrayList.
*/
public class EvenNumList {
	public static void main(String[] args) {
		ArrayList<Integer> evenNum = new ArrayList<>();
		for (int i = 0; i <= 50; i += 2) {
			evenNum.add(i);
		}
		System.out.println("Even Number List from 1 to 50 : \n" + evenNum);
		Iterator<Integer> num = evenNum.iterator();
		System.out.println();
		while (num.hasNext()) {
			int a = num.next();
			if (a % 5 == 0) {
				num.remove();
			}
		}
	System.out.print("Even Number List from 1 to 50 (without number divisible by 5) :\n"+evenNum + " ,");
	}
}

//for(int i=0;i<=50;i +=2){
//nums.add(i);
//System.out.println(nums);