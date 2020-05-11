package com.syntax.class22;

public class OverloadingMain {
public static void main(String[] args) {//java looks for this main method with this signature
	System.out.println("Mehtod with array arguments");
	OverloadingMain.main("str");
	main("str");
	main("hello","Hi");
	//int[] arr=new int[2];
	main(new int[2]);
}
public static void main(int[] args) {
System.out.println("Mehtod with array arguments");	
}
public static void main(String args) {
	System.out.println("Mehtod with String arguments");
}
public static void main(String args,String args1) {
	System.out.println("Mehtod with 2 String arguments");
}
}

