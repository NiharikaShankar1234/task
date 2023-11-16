package com.staticDemo;		// brief info abt Static keyword in java mainly used for memory mgt. Share the same area Shared by all.
						// 1)Blocks 2)Variables 3) Methods 4) Classes
public class Add {     // Shared memory allocation: Static variables and methods are allocated memory only once during the program
					// execution. This memory space shared by all objects of class. Which make static as useful and maintaining
	int a;		// global state. Get space in data segment in java space and inside heap it will be stored
	int b; // Static methods and variables cannot access non-static members of class as they are associated with any Particular instance
	int sum;
	
	//static block										
	static {
		System.out.println("Performing Addition ");
	}
	//Constructor 
		public Add(int a, int b){
			System.out.println("Inside Constructor ");
			this.a = a;
			this.b = b;
			sum = a+b;
		}
		//display
		public static void Addition () {
			System.out.println("Inside Static Method");
		}
		public void display() {
			System.out.println("Addition of " +a+ " and "+ b + " gives "+ sum);
		}
	public static void main(String[] args) {
		System.out.println("Inside main Method");
		Add a = new Add(10, 20); 
		a.display();
		a.Addition();
	}
}
