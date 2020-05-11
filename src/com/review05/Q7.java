package com.review05;

import java.util.*;
import java.util.Arrays;

public class Q7 {

	public static void main(String[] args) {
		int[]numbers= {16,89,61,16,89,74,25};
		Arrays.sort(numbers);
		System.out.println("Smallest"+ numbers[0]);
		System.out.println("Biggest"+numbers[numbers.length-1]);
		System.out.println("Second largest "+numbers[numbers.length-2]);
		
		int[]numbers2= {100,1,32,61,16,89,74,89,90,25};
		int smallest=numbers[0];
		int largest=0;
		int largest2=0;
		for (int i=0;i<numbers2.length;i++) {
			int element=numbers2[i];
			if(element>largest) {
				largest2=largest;
				largest=element;
			}else if(element>largest2 && element !=largest) {
				largest2=element;
			}
			if(element<smallest) {
				smallest=element;
				
			}
			System.out.println("smallest"+smallest);
			System.out.println("biggest"+largest);
			System.out.println("second largest "+largest2);
	}
	

	}

}
