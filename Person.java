package com.Coupling;

public class Person {

	public static void main(String[] args) {
		Train t1 = new Train();
		t1.start();
		
		Bus b1 = new Bus(); // person is dependent on travel
		b1.start();
	}
}
