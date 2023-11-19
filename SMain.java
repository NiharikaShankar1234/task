package com.array;

public class SMain {
	public static void main(String[] args) {
	//declare student array
		Student[] arr;   // inside java we can use array as object
		//allocating memory
		arr = new Student[3];
		
		// initialise
		arr[0] = new Student(101, "Karan");  // (obj1) with the help of constructor we give values 
		arr[1] = new Student(102, "Janu");	//obj2
		arr[2] = new Student(103, "Somu");	//obj3
		
		// accessing
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i].roll_no+ " "+ arr[i].name);
		}
}
}
