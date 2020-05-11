package com.syntax.class08;

public class task1 {

	public static void main(String[] args) {
		// print nos from 1-50 except those divisible by 3
		for(int i=1;i<51;i++) {
			if(i%3==0) {
				continue;
			}
			System.out.println(i);
			
		}
		

	}

}
