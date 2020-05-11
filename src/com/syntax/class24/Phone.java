package com.syntax.class24;

public abstract class Phone {
	//implemented methods 
public void call() {
	System.out.println("Phone can make a call");
}
public void text() {
	System.out.println("Phone can send text");
}
// unimplemented methods= undefined methods=abstract methods
public abstract void takePicture();
public abstract void playMusic();
}
class iphone extends Phone{
	//override
	public  void takePicture() {
		System.out.println("Phone can take pictures");
	}

	public void playMusic(){
		System.out.println("Phone play music using apple store");
	}
}
class samsung extends Phone{
	//override
	public  void takePicture() {
		System.out.println("Phone can take pictures");
	}
//override
	public void playMusic(){
		System.out.println("Phone play music using google store");
	}
}
