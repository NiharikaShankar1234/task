package com.Strings;

public class CharSequence {
	public static void main(String [] args) {
		String mainSequence ="Rocking Star";
	String subSequence = "Yash";
	boolean result = contains(mainSequence, subSequence);
System.out.println("The main Sequence contain SubSequence: " + result);
	
	}

	private static boolean contains(String mainSequence, String subSequence) {
		// TODO Auto-generated method stub
		return mainSequence.toString().contains(subSequence);
	}
}
