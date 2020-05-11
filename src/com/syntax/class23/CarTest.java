package com.syntax.class23;

public class CarTest {

	public static void main(String[] args) {
		
		Car bmw=new BMW("BMW");
		bmw.display();
		bmw.start();
		Car tesla=new Car("Tesla");
		Car merc=new Car("Mercedes");
		Car[] cars={new BMW("BMW"),new Car("Tesla"),new Car("Mercedes")};
		for(Car c:cars) {
			c.start();
			c.display();
			System.out.println("________________________");
			for(int i=0;i<cars.length;i++) {
				cars[i].start();
				cars[i].display();
				
			}
		}
	}

}
