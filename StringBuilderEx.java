package com.StringsBuilder;
/* More thread can be running simultaneously.if thread running simultaneously
 * it is not thread safe. It is Non-Synchronized. 
 * It was introduced in java 1.5 version
  */
public class StringBuilderEx {
	public static void main(String[] args) {
		
		//create
		StringBuilder sb=new StringBuilder("Hello ");
		sb.append("java");
		System.out.println(sb);
		
		 sb.insert(0,"Hii ");
		 System.out.println("Insert : "+sb);
		 
		 sb.delete(0, 3); 
		 //From start index it will delete until the last index, but not last index 
		System.out.println("Delete : "+sb);
		sb.replace(7, 11, "Raaj");
		 System.out.println("Replace : "+sb);
		 
		 StringBuffer sb1 = new StringBuffer("hello");
		 sb1.reverse();
		 System.out.println(sb1);
	}
}
