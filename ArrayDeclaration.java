package com.array;

public class ArrayDeclaration {
	public static void main(String[] args) {
		// declare
		int arr[];
		
		//allocating memory
		arr = new int[3];
		
		// instantiate
		// index start with zero
		arr[0]=20;
		arr[1]=40;
		arr[2]=60;
		
		
		// accessing 
		for(int i=0; i<arr.length; i++) {
			System.out.println("Elements at index : " + i+ " = " +arr[i] );
		}
	}
}
