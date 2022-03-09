package com.divergentsl.corejava.datatypes.copy;

public class DataTypes6Char {

	//Using unicode without quotes
	public static void main(String\u005B\u005D args) {

			// Unicode chars
			char tm = '\u2122';
			char pi = '\u03C0';
			System.out.println("Values :" + tm + " " + pi);
			
			// The char is treated as integer in arithmetic operation
			int i = 'a' + 1;
			System.out.println(i);
			
			//can cast an integer to char
			System.out.println((char)i);
	}

}
