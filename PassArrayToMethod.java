package com.array;

public class PassArrayToMethod {

	//min 
		static void min(int arr[]) { //min is mtd name
			//min = 50
			int min = arr[0]; // min is variable name 0th index value is given by default
			//i=1 ie is 10
			for(int i=0;i<arr.length;i++)
				//50>10 true so 10 will go to min 
				if(min>arr[i])
					min=arr[i];
			System.out.println("Minimum no ="+min);
		}
		
		public static void main(String[] args) {
			int a[]= {50,10,20,200,1};
			//passing array to method call 
			min(a);
		}

	}
			


