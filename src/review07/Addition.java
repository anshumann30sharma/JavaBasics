package review07;

public class Addition {

	public static void add(int a,int b) {
		System.out.println("The sum is "+(a+b));
	}
	public static void add(int a,int b,int c) {
		//overloading methods--have same signatures, 
		//but with different parameters
		System.out.println("The sum is "+(a+b+c));
	}
	public static void add(int a,double b) {
		System.out.println("The sum is "+(a+b));
	}
	public static void add(double b,int a) {
		System.out.println("The sum is "+(a+b));
	}
		
	public static void main(String[] args) {
	add(4,5);
	add(3,5,8);
	add(3,4.5);
	add(3.2,6);	
	}
}
