package com.Multidimentionalarraydemo;

public class ForEachMultiDimentional {
	public static void main(String[] args){
		int arr[][]= {{10,20,30},{40,50,60},{70,80,90}};
		for(int[] i:arr)
		{
			for(int j:i) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
