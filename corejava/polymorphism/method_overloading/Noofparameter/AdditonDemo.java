package com.xworkz.corejava.polymorphism.method_overloading.Noofparameter;

public class AdditonDemo {
	public static void main(String[] args) {
	Addition a = new Addition();
	
	System.out.println("result= " + a.add(5, 5));
	System.out.println("result2="+ a.add(6, 6, 6));
	System.out.println("result3="+ a.add(7, 7, 4, 50));
	
}
}
