package com.syntax.class7;

public class HW4 {

	public static void main(String[] args) {
		// Print odd numbers between 20 and 50 (2 ways)
		System.out.println("=====1st Way==========================");
		for (int b = 20; b <= 50; b++) {
			if (b % 2 != 0)
				System.out.println(b);
		}
		System.out.println("=====2nd Way==========================");
		int z = 20;
		while (z <= 50) {
			if (z % 2 != 0) {
				System.out.println(z);
			}
			z++;
		}
		System.out.println("=====3rd Way==========================");
		for (int c = 20; c < 50; c++) {
			System.out.println(c += 1);
		}

		for (int i = 21; i <= 50; i += 2) {
			System.out.println(i);
		}
		int total = 2;
		for (int k = 1; k < 4; k++) {
			total = total * k;
		}
		System.out.println("Final total" + total);

		
		int evensSum=0;
		int oddsSum=0;
			
		for(int i=1;i<=99;i++) {
			if (i % 2==0)
			{
			evensSum=evensSum+i;
			}else {
				oddsSum=oddsSum+i;
			}
		}
			System.out.println(evensSum);
			System.out.println(oddsSum);		
				

			//writ a programme to calculate sum of odd and even numbers
				// 1-99
			
			System.out.println("---------------------------continue-----------");
			for(int y=1;y<=10;y++) {
				if(y==4) {
					System.out.println("I am skipping iteration");
					continue;
				}
				System.out.println("I am inside the loops");
				System.out.println(y);
			}
//write a programme that print numbers from 1-20
			//i do not want to print 5,6,7
			for(int i=1;i<21;i++) {
				if(i==5 || i==6 || i==7) {
					continue;
				}
				System.out.println(i);
			}
			
		
		
		
	}

}
