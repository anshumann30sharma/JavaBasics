package com.syntax.class13;

public class q2 {
public static void main(String[] args) {
	/*divisible by 1 and itelf
	 * greater than 1
	 * 2,3,5,7,11,13,17...
	 */
	int given=7;
	boolean isPrime=true;
	if(given>1) {
		for(int i=2;i<given;i++) {
			if(given%i==0) {
				isPrime=false;
				break;
			}
	}
	}else {
		isPrime=false;
	}
	System.out.println("Given number " +given +"is prime? " +isPrime);
}

}
