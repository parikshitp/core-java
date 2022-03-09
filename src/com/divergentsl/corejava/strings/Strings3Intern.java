package com.divergentsl.corejava.strings;

public class Strings3Intern {

	public static void main(String[] args) {

		String constantString = "interned";
		String newString = new String("interned");

		var resultFirst = (constantString == newString) ? "Both are same -- 1" : "";
		
		System.out.println(resultFirst);

		String internedString = newString.intern();

		var resultSecond = (constantString == internedString) ? "Both are same -- 2" : "";
		
		System.out.println(resultSecond);
	}

}
