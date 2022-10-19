package com.xworkz.corejava.Inheritance.Association;

public class AssociationDemo {
public static void main(String[] args) {
	
	 library library =new library();
	 library.name = "sks";
	 library.noofbooks = 100;
	 library.location = "hubli";
	 
	 
	 library.student = new student();
	 
	 System.out.println("student name = "+ library.student.name);
	 System.out.println("student id = "+ library.student.id);
	 System.out.println("student college = "+ library.student.college);
	 
	 
}
}
