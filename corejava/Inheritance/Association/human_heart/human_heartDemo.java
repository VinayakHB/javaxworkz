package com.xworkz.corejava.Inheritance.Association.human_heart;

public class human_heartDemo {

	public static void main(String[] args) {
	    Human human = new Human();
	     human.gender = "male";
	     human.age = 20;
	     
	     human.heart = new Heart();
	     
	     System.out.println("human gender = "+ human.gender);
	     System.out.println("heart work = "+ human.heart.work);
	     System.out.println("heart beat = "+ human.heart.heartbeat);
	     
	     
	    
	    
	}

}
