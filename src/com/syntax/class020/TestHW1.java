package com.syntax.class020;
/*Home Work-1
Write program: Shape class has a constructor that takes the radius and has a subclass as  circle class. 
In circle class create a method to calculate the area of circle. Test your code
*/
import java.util.Scanner;
public class TestHW1 {
	public static void main(String[] args) {
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a Radius");
		i=sc.nextInt();
		CircleClass c=new CircleClass(i);
		c.calculateCircle();
		sc.close();
	}
}
class ShapeClass{
	int radius;
	ShapeClass(int radius){
		this.radius=radius;
	}
}
class CircleClass extends ShapeClass {
	static double pi=3.14;
	CircleClass(int radius){
		super(radius);
	}
	void calculateCircle() {
		System.out.println("Formula of Circle from Given radius is A=pi*(radius*radius)");
		double area;
		area=pi*radius*radius;
		System.out.println("Area of Circle with given Radius: "+radius+" is "+area);
	}
}

