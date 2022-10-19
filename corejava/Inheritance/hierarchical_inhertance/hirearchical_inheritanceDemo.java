package com.xworkz.corejava.Inheritance.hierarchical_inhertance;

public class hirearchical_inheritanceDemo {
  public static void main(String[] args) {
	  vehicle vehicle = new vehicle();
	  Bike bike =new Bike();
	  car car = new car();
	  truck truck = new truck();
	   
	 
	  bike.speed();
	  bike.wheeling();
	  car.speed();
	  car.drift();
	  truck.speed();
	  truck.load();
	  
  }
}
