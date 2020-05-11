package com.syntax.class7;

public class hw3 {

	public static void main(String[] args) {
		// Print even numbers from 20 to 1 (2 ways)
		System.out.println("=====1st Way==========================");
		for (int a = 20; a >= 1; a--) {
			System.out.println(a--);
		}
		System.out.println("=====2nd Way==========================");
		for (int a = 20; a >= 1; a--) {
			if (a % 2 == 0) {
				System.out.println(a);
			}
		}

	}

}
