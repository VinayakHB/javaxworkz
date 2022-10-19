package com.xworkz.corejava.polymorphism.method_overloading;

public class Addition2Demo {
	public static void main(String args[]) {
		Addition2 addition2 = new Addition2();
		
	
		System.out.println("result= " + addition2.add(45, 45));
		System.out.println("result2=" + addition2.add(20, 30, 40));
	}

}
