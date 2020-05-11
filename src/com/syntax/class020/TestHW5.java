package com.syntax.class020;

public class TestHW5 {
	/***Home Work-5
	Create 1 class in which create a methods that will calculate the area (volume) of 
	Rectangle
	Square
	Box
	Use separate class to test your code
	***/

		public static void main(String[] args) {
			AreaCalculation volume=new AreaCalculation();
			volume.area(10);
			volume.area(15,12);
			volume.area(4, 5, 4);
		}
	}
	class AreaCalculation {
		int side, length, width, height;
		void area(int side) {
			this.side = side;
			System.out.println("Area of Square for given Value "+side+" is "+(side*side));
		}
		void area(int length, int width) {
			this.length = length;
			this.width = width;
			System.out.println("Area of Rectangle for given Length "+length+ " & width "+width+" is "+(length*width));
		}
		void area(int length, int width, int height) {
			this.length = length;
			this.height = height;
			this.width = width;
			System.out.println("Area/Volume of Box for given Length "+length+ " & width "+width+
					" & height "+height+" is "+(length*width*height));
		}
	}

