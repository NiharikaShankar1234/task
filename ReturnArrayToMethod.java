package com.arraydemo;

public class ReturnArrayToMethod {
	//method getting array
	//public int add
	public static int[] get(){
		//return array
		return new int[] {1,2,3,4};
		}
	public static void main(String[]args) {
		int arr[] = get();
		for(int i =0; i<arr.length; i++)
			System.out.println(arr[i]+" " );
	}
}

