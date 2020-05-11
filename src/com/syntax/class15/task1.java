package com.syntax.class15;

import java.util.Scanner;

public class task1 {
	/*
	 * Task-2 Write a method to return whether given number is prime or not?
	 */
	static boolean checkPrime(int n) {
		int i, m;
		m = n / 2; // displays largest divisor of a given number;
		if (n == 0 || n == 1 || n < 1) {
			return false;
		} else {
			for (i = 2; i < m; i++) {
				if (n % i == 0) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.println("Please enter a number: ");
			n=sc.nextInt();
			if (checkPrime(n)) {
				System.out.println(n+" is a prime number.");
			}else {
				System.out.println(n+" is not a prime number.");
			}
		} while(checkPrime(n)==false);
		sc.close();
	}


	}


