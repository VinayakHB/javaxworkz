package com.xworkz.corejava.polymorphism.method_overriding;

public class metod_overridingDemo {
	public static void main(String args[]) { 
	RBI rbi = new RBI();
	SBI sbi = new SBI();
	HDFC hdfc = new HDFC();
	 
	System.out.println(rbi.getInterestrate());
	System.out.println(sbi.getInterestrate());
	System.out.println(hdfc.getInterestrate());
	}
}
