package com.divergentsl.corejava.strings;

public class Strings6NewKeyword {

	public static void main(String[] args) {
		String var1= "length: 10";

		String var2 = new String("length: 10");

		System.out.println("first and second are equal: " + (var1== var2));
		
		var2= var2.intern();
		// IMPORTANT At this point the String object created at run-time using new keyword becomes eligible for garbage collection.
	}

}
