package com.java_part;

public class StringFunctions {
	
	public static void main(String args[])
	{
		String str="ABCD";
		System.out.println(str.charAt(0));
		System.out.println(str.codePointAt(0));
		System.out.println(str.codePointBefore(1));
		System.out.println(str.compareTo("Acd"));
		System.out.println(str.concat(" hello"));
		System.out.println(str.hashCode());
		System.out.println(str.concat(" hello"));
		System.out.println(str.concat(" hello"));

	} 
}
