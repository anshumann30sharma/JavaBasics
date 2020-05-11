package com.syntax.class7;

public class PostAndPreIncrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//+=, --
		//pre increment ++y,  post increment++
		int z;
		int y=10;
				z=y++;// first use the variable then increment
		System.out.println(z);
		int w;
		int x=10;
		w=++x;// first increment then  use it and assign it
		System.out.println(w);
		
		int num=1;
		while(num<5) {
			++num;
			System.out.println(++num);
		}
		System.out.println();
	}

}
