package com.syntax.class24;

public class TestVehicle1 {
			public static void main(String[] args) {
			SchoolBus[]  va= {new SchoolBus()};
				for(int i=0; i<va.length; i++) {
					va[i].brake();
					va[i].drive();
					va[i].start();
					va[i].stop();
				}
			}
		

	}


