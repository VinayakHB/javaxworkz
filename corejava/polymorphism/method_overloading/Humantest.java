package com.xworkz.corejava.polymorphism.method_overloading;

public class Humantest {
public static void main(String[] args) {
	Human ram = new Human();
	Unknown unknown = new Unknown();
	Friend friend = new Friend();
	
	ram.speak(unknown);
	ram.speak(friend);
}

}

