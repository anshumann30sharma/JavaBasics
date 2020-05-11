package com.syntax.class19;

public class Book {
/*Write program as a Book class  
 that will have 2 Constructors. 
 While creating an object make sure:
Instance variables are being initialized
Both Constructors are being executed
*/
	String english,maths;
	public Book() {
//		this.();
		
	}
	public Book(String english,String maths) {
		this.english=english;
		this.maths=maths;
	}
	public void english() {
		System.out.println(english);
	}
	public void maths() {
		System.out.println(maths);
}
	
		public static void main(String[] args) {
			Book obj=new Book("Grammar","Statistics");
			obj.english();
			obj.maths(); 
			
		}	
}
