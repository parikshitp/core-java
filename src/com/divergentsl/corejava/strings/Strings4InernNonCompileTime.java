package com.divergentsl.corejava.strings;

public class Strings4InernNonCompileTime {

	public static void main(String[] args) {
		String var1 = "length: 10";

		String var2 = "length: " + var1.length();

		// The var1 is initialized by a constant expression at compile time, but not var2 and hence
		// automatic interning will not happen for var2, and hence var1 and var2 will be
		// two different objects with same value
		System.out.println("first and second are equal: " + (var1 == var2));

		System.out.println("first and second are equal(with equals): " + (var1.equals(var2)));

	}

}
