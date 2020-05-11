package com.syntax.class13;

public class q3 {

	public static void main(String[] args) {
		/* write programme to print first 10 fibonacci series
*/
		int a,b,c;
		a=0;
		b=1;
		for(int i=1;i<=10;i++) {
			System.out.print(a+ " ");
			c=a+b;
			a=b;
			b=c;
		}
	}

}
