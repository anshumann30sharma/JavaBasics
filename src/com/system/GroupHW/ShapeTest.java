package com.system.GroupHW;

public class ShapeTest {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.calculateArea(14);
		c.calculatePerimiter(14);
		Square s = new Square();
		s.calculateArea(4);
		s.calculatePerimiter(6);
	}	
}
class Circle implements Shape {
	@Override
	public void calculateArea(double radius) {
		// circle area = pi*radius*radius
		double c = pi * radius * radius;
		System.out.println("The area of circle is " + c);
	}
	@Override
	public void calculatePerimiter(double radius) {
		// Perimiter of circle = p=2*pi*radius
		double p = 2 * pi * radius;
		System.out.println("The perimiter of the circle " + p);
	}
}
class Square implements Shape {
	@Override
	public void calculateArea(double a) {
		// square calculation formula: area=i*i;
		double area = a * a;
		System.out.println("The area of this square equals " + area);
	}
	@Override
	public void calculatePerimiter(double side) {
		// square perimeter formula:perimiter=4*side
		double perimiter = 4 * side;
		System.out.println("The perimiter of this square equals " + perimiter);
	}

	}


