package com.java9;
/*
* 1)Abstract method 
2)Constant variable (final)
3)Default method (imple of method inside interface is allow)
4)Static method (imple of method inside interface is allow)
5)Private methods
6)private static methods also u can create

*/
public interface Temp {
	//abstract
			public abstract void div(int a,int b);
			
			//default method
			public default void add(int a,int b) {
				System.out.println("Default method inside interface..");
				System.out.println(a+b);
				//private method inside default method
				sub(a,b);
				//static private method inside other non-static method we need to call
				mod(a,b);
			}
			
			//static method
			public static void mul(int a,int b) {
				System.out.println("Static method.....");
				System.out.println(a*b);
}
			//private method
			private void sub(int a,int b) {
				System.out.println("private method....");
				System.out.println(a-b);
			}
			
			//private Static method
			private static void mod(int a,int b) {
				System.out.println("private static method..");
				System.out.println(a%b);
			}
	}