package com.divergentsl.corejava.operators;

public class Operators10ShiftOperators {

	public static void main(String[] args) {

		int x = 0B00000000_00000000_00000000_00000100; // is 4 in decimal
		//0B00000000_00000000_00000000_0000010;
		//0B00000000_00000000_00000000_00001000;
		System.out.println(x);
		System.out.println(x >> 1);
		System.out.println(x << 1);
		
		
		
		int y = 0B11111111_11111111_11111111_11111100; // is -4 -- IMPORTANT the basic rule is to take the positive,
		System.out.println(y);
		System.out.println(y >> 1);
		

		
		
		int z = 0B11111111_11111111_11111111_11111111; // equivalent to -1 in decimal;
		System.out.println(z >>> 29); // The value of 'x>>>29' is 00...0111
		System.out.println(z >>> 30); // The value of 'x>>>30' is 00...0011
		System.out.println(z >>> 31); // The value of 'x>>>31' is 00...0001
	}

}
