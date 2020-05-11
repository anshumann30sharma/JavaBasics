package com.review08;

public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Circle c=new Circle(14);
//c.calculateArea(14);
//c.calculatePerimeter(14);

	}

//	class circle implements shape{
		public void calculateArea(double c) {
	//		double c=pi*radius*radius;
			System.out.println("Area of circle is "+c);
	}
		public void calculatePerimeter() {
}
}
	class square implements shape{
		public void calculateArea(double a) {
//			double area=a*a;
		}
			public void calculatePerimeter(double radius) {
				double p=2*pi*radius;
				System.out.println(" perimeter of the circle equals "+p);
			}
	}