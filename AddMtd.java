package com.array;

public class AddMtd {
		/*public static void add(int[]a) {
			int sum=0;
			for(int i:a) {
			  sum+=i;
			}
			System.out.print("Sum of Elements = "+sum);
		}
		public static void main(String[]args) {
			int arr[]= {10,27,37,7};
			add(arr);
		}
	} */

		static void add(int ary[]) {
			int sum=0;
			for(int i=0;i<ary.length;i++)
				sum = sum +ary[i];
						System.out.println("Addition of array = "+sum);
		}
	public static void main(String[]args) {
		int a[]= {100,25,15,10};
		add(a);
		
	}
	}

