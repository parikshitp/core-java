package com.divergentsl.corejava.strings;

public class Strings5InternImmutable {

	public static void main(String[] args) {
		String var1 = "length: 10";

		String var2 = "length: " + var1.length();
		// The statement var2.intern() will compare the value of var2 with values in the
		// pool and return the reference to the string literal pointed by var1 from the
		// pool (but doesn't change var2 itself as Strings are immutable).
		//To change var2, we needed to assign the returned inter string explicitly to var2.
		String var3 = var2.intern();

		System.out.println("first and second are equal: " + (var1 == var2));
		
		System.out.println("first and third are equal: " + (var1 == var3));

		System.out.println("first and second are equal(with equals): " + (var1.equals(var2)));
	}

}
