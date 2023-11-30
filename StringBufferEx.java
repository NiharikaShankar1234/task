package com.StringsBuffers;
/*mutable,  We will have 3 constructors, 
StringBuffer(Stringstr), StringBuffer(intitial capacity)=16, 
Methods -> append, insert, replace, delete
Thread-safe only one thread can run on single time. ex. when we are playing song we cannot take print
class synchronized bcz of single thread is running at a time so it is less efficient
it was used in 1.0 version of java We can easily modify the String */

public class StringBufferEx { //append method
	 public static void main(String[]args) {
		 StringBuffer sb = new StringBuffer("Hii");
		 //mutable, original String is changed in String Buffer Class
		 sb.append(" Everyone ");
		 System.out.println(sb);
		 
		 //insert method
		 StringBuffer sb1 = new StringBuffer("Hi All");
		 sb1.insert(3, " Welcome "); //index value can be changed
		 System.out.println(sb1);
	 }
}
