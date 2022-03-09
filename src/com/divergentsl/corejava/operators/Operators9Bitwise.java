package com.divergentsl.corejava.operators;

public class Operators9Bitwise {

	public static void main(String[] args) {

		int a = 5; //= 0101 (In Binary) ... .can also be written as "0B0101" in binary
		int b = 7; // = 0111 (In Binary)

		// Bitwise OR Operation of 5 and 7 -->>  0101 | 0111 =  0111  -->>  7 (In decimal)
		System.out.println(a | b);
		
		// Bitwise AND Operation of 5 and 7 -->>  0101 & 0111 =  0101  -->>  5 (In decimal)
		System.out.println(a & b);
		
		// Bitwise XOR Operation of 5 and 7  -->>  0101 & 0111 =  0010  -->>  2 (In decimal)
		System.out.println(a ^ b);
		
		//Bitwise ~ Compliment operator, ~7 -->> inverting the bits OR -(7+1) = -8
		System.out.println(~b);
		
	}

}
