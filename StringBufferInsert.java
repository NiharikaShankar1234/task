package com.StringsBuffers;

public class StringBufferInsert {
	public static void main(String[]args) {
		 StringBuffer sb = new StringBuffer("Good");
		 System.out.println("StringBuffer : "+sb);
		 
		 //append method
		 sb.append(" Morning");
		 System.out.println("Append : "+sb);
		 
		 //Insert Method
		 sb.insert(0,"Hii ");
		 System.out.println("Insert : "+sb);
		 
		 //delete Method
		// sb.delete(0, 3); 
 //From start index it will delete until the last index, but not last index 
		// System.out.println("Delete : "+sb);
		 
		 //Replace Method
//The last index char will not change, if needed we must take next number
//Good = 0-3 if we give end index as 3 then d will not get changed so we need to give 4
		 sb.replace(9, 16, "Evening");
		 System.out.println("Replace : "+sb);
}
}