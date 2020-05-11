package com.system.GroupHW;
/*Create a Parent Class that will have two overloaded abstract methods m1

Make Main class as concrete subclass to Parent Class 

In main method call the methods. 

Expected Output:
m1 without parameters
m1 method with parameter
*/
abstract class Parent{
    abstract void m1();
    abstract void m1(String str);
  
public static void main(String[] args) {
  class Main extends Parent{
        void m1(){
        System.out.println("m1 without parameters");
        
        }
        void m1(String str){
          System.out.println("m1 method with parameter");
        
        
          Parent obj= new Main();
          obj.m1();
          obj.m1("kofi");
        }

  }   

}
}


















