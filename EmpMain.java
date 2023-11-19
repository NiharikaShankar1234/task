package com.array;

public class EmpMain {
	public static void main(String[] args) {
		//declare Employee array
			EmployeeArray[] arr;   // inside java we can use array as object
			//allocating memory
			arr = new EmployeeArray[3];
			
			// initialise
			arr[0] = new EmployeeArray(2001, "Karan", "Bengalore");  // (obj1) with the help of constructor we give values 
			arr[1] = new EmployeeArray(2002, "Renu", "Bengalore");	//obj2
			arr[2] = new EmployeeArray(2003, "Janu", "Bengalore");	//obj3
			
			// accessing
			
			for(EmployeeArray i: arr) //for each loop
			{
			System.out.println(i.id +" "+ i.name+ " "+ i.loc);
			
			}
	}
}
