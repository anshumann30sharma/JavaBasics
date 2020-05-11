package com.system.GroupHW;
//create food class that will have 3 undefined methods and it will have 4 subclasses; 
//create a collection of food and using 3 ways execute methods


	public abstract class Food {
		String type;
		Food(String type){
			this.type=type;
		}
		public abstract void eat();
		public abstract void vitamin();
		public abstract void availablility();
	}
	class Apricots extends Food{
		Apricots(String type) {
			super(type);
			// TODO Auto-generated constructor stub
		}
		@Override
		public void eat() {
			System.out.println("We eat "+type);
		}
		@Override
		public void vitamin() {
			System.out.println(type+" is a good source of vitamin A");
		}
		@Override
		public void availablility() {
			System.out.println(type+" is available during May to July.");
		}
	}
	class SeaFood extends Food{
		SeaFood(String type) {
			super(type);
			// TODO Auto-generated constructor stub
		}
		@Override
		public void eat() {
			System.out.println("We like to eat "+type);
		}
		@Override
		public void vitamin() {
			System.out.println(type+" is a good source of vitamin B");
		}
		@Override
		public void availablility() {
			System.out.println(type+" is available all the cities in USA around the year.");
		}
	}
	class Strawberries extends Food{
		Strawberries(String type) {
			super(type);
		}
		@Override
		public void eat() {
			System.out.println("We like to eat "+type);
		}
		@Override
		public void vitamin() {
			System.out.println(type+" is a good source of vitamin C");
		}
		@Override
		public void availablility() {
			System.out.println(type+" is available during late April and May.");
		}
	}
	class Asparagus extends Food{
		Asparagus(String type) {
			super(type);
		}
		@Override
		public void eat() {
			System.out.println("We like to eat "+type);
		}
		@Override
		public void vitamin() {
			System.out.println(type+" is a good source of vitamin E");
		}
		@Override
		public void availablility() {
			System.out.println(type+" is available during late February to June.");
		}
	
	}


