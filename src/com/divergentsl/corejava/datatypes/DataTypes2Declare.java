package com.divergentsl.corejava.datatypes;

/**
 * Different prefix/suffix/underscore possible in the numbers.
 * @author parikshit
 *
 */
public class DataTypes2Declare {

	public static void main(String[] args) {

		// Long with suffix l or L
		long l = 1000;
		
		float f = 3.14f;
		
		// Hexa decimal prefix 0x or 0X
		int hexa = 0xCAFE;
		
		// Octal 
		int octal = 010;
		
		//Binary
		int binary = 0b1001;
		
		// underscore
		int million = 1_000_000;
		
		System.out.println("Long " + l  + " Float " + f  + " Hexa " + hexa + " Octal " + octal + " Binary " + binary + "  Undersore " + million);
		
	}

}
