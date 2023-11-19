package com.Multidimentionalarraydemo;

public class MultiplicationOfMDArray {
	public static void main(String[] args) {
		
		int arr1[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int arr2[][]= {{9,8,7},{6,5,4},{3,2,1}};
		
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1[0].length;j++) 
			{
				int Product=0;
				for(int k=0;k<arr1.length;k++) {
					Product += (arr1[i][k]*arr2[k][j]);
				}
				System.out.print(Product+" ");
			}
			System.out.println();
		}

	}
}
