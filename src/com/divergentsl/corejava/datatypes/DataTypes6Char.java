package com.divergentsl.corejava.datatypes;

public class DataTypes6Char {

	//Using unicode without quotes
	public static void main(String\u005B\u005D args) {

			// Unicode chars
			char tm = '\u2122';
			char pi = '\u03C0';
			char a = 'a';
			
			{
				int x = 1;
				System.out.println(x);
			}
		
			
			System.out.println("Values :" + tm + " " + pi);
			
			// The char is treated as integer in arithmetic operation
			int i = 'a' + 1;
			System.out.println(i);
			
			System.out.println((int)'c');
			
			//can cast an integer to char
			System.out.println((char)i);
			
	}

}
