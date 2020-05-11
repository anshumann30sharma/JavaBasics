package com.system.GroupHW;

public class CarTest {

	public static void main(String[] args) {
		Truck tr = new Truck(20000, "Black", 3000);
		System.out.println(tr.calculateSalePrice());
		Sedan sd = new Sedan(10000, "Green", 30);
		System.out.println(sd.calculateSalePrice());
	}


	}


