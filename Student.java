package com.staticDemo;

public class Student {

	int rollno;
	String name;
	//College name as static type, common element need not be repeated in code, it can be created once and used many times
	static String Collage_name = "IIT";
	
	//Constructor 
	Student(int rollno, String name){
		this.rollno=rollno;
		this.name=name;
	}
	//display
	public void display() {
		System.out.println(rollno+ " "+ name+ " "+ Collage_name);
	}
	public static void main(String[] args)
{
Student s1 = new Student(101,"abc");		
Student s2 = new Student(102,"pqr");

s1.display();
s2.display();
}
}
