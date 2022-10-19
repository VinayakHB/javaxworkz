package com.xworkz.corejava.polymorphism.method_overriding;

public class UniversityDemo {

	public static void main(String[] args) {
		
		University university  = new University();
		College_A kle = new College_A();
		College_B kls  = new College_B();
		
		System.out.println(university.feesforBEcouse());
		System.out.println(kle.feesforBEcourse());
		System.out.println(kls.feesforBEcouse());
		
		

	}

}
