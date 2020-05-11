package com.syntaxclass10;

public class test {

	public static void main(String[] args) {
		int[] numbers = { 2, 4, 6, 8, 10 };
		int sum = 0;
		for (int i : numbers) {
			sum += i;
		}
		System.out.println("The sum of numbers is " + sum);

		for (int i = 0; i < numbers.length; i++) {
			sum += i;
			System.out.println("The sum of numbers is " + sum);
		}
	}
}
