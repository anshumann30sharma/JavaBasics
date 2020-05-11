package com.syntaxclass10;

public class practice1 {

	public static void main(String[] args) {
		/*Write a program that creates an array of integers and 
		 * stores the following values: 45, 78, 12,  67, 55 and
		 *  then prints all array values. 

Output:
45 78 12 67 55
*/
		int [] num= {45 ,78 ,12 ,67 ,55 };
		
		//getting all elements
		for(int i=0;i<num.length;i++) {
			
			System.out.print(num[i]+" ");	

		}
		
		/*Write a program that creates an array of integers
		 *  that stores the following values: 45,78, 12,  67, 55, 89, 23, 77, 88
Print only values that stored with even index including 0.
Output:
45 12 55 23 88 
*/
	
	int [] num1= {45 ,78 ,12 ,67 ,55,89,23,77,88};
	System.out.print(num1[0]+" "+num1[2]+" "+num1[4]+" "+num1[6]+" "+num1[8]);


}
}


