package com.Strings;

public class StringImmutalbeEx { //IM will be final 
	public static void main(String[] args) {
		String s1 = "MS"; //If needed we should Explicitly done
		s1=s1.concat("Dhoni"); //Explicitly changing the string
		System.out.println(s1);
	}
	}
/* String is Immutable to make it threat safe and security purpose */
