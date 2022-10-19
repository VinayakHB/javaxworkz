package com.xworkz.corejava.polymorphism.method_overloading.typeofparameter;

public class Addition2Demo {
  public static void main(String []args) {
	  Addition2 add = new Addition2();
	    
	  System.out.println("result1 = "+ add.add(10, 50));
	  System.out.println("result2 = "+ add.add(5.5, 4.50, 6.80));
  }
}
