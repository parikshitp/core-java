package com.divergentsl.corejava.typecasting;

public class TypeCasting1Conversion {

	public static void main(String[] args) {
		int i = 123456789;
		System.out.println(i); // prints 123456789
		
		float f = i;
		System.out.println(f);  // prints 1.23456792E8 check "..92" at the end instead of "..89"

		int z = 10;
		String result = z > 10 ? "i is greater than 10": "i is less than 10";
		System.out.println(result);
		
	}

}
