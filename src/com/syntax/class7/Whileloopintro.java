package com.syntax.class7;

public class Whileloopintro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int time=10;
//if (time>12) {
		// System.out.println("Good Morning");

//System.out.println("-------while loop-----");
//while(time<=12) {
		// System.out.println("Good morning");
//	time++;
//itialize the variable
		// while(test variable) {
		// code;
		// increment or decrement;
		// how to print numbers from 1-50?
		// int num=1;
		// while(num<=50) {
		// num++;
		// System.out.println(num);
		// }
		// how to print values from 10-1?
		int num3 = 50;
		while (num3 >= 50) {
			System.out.println(num3);
			num3--;

		}

		// print odd numbers 1-20
		int num4 = 1;

		while (num4 < 20) {
			System.out.println(num4);
			num4 += 2;
		}

		int num5 = 1;
		while (num5 <= 20) {
			if (num5 % 2 != 0) {
				System.out.println(num5);
			}
			num5++;
		}

		int y = 1;
		while (y <= 20) {
			System.out.println(y++);
			y++;
		}
	}
}
