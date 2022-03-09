package com.divergentsl.corejava.generics;

import java.util.Arrays;
import java.util.List;

public class Generics4Caching {

	/*
	 * POINT - The boxed values may be cached. Caching is required when boxing an
	 * int or short value between–128 and 127, a char value between '\u0000' and
	 * '\u007f', a byte, or a boolean; and caching is permitted when boxing other
	 * values.
	 */
	public static void main(String[] args) {
		List<Integer> smalls = Arrays.asList(1, 2, 3);
		assert sumInteger(smalls) == sum(smalls);
		
		/*
		 * POINT - This is because 6 is smaller than 128, so boxing the value 6 always returns
		 * exactly the same object.
		 * CAUTION - This is JVM implementation dependent, it may also return false.
		 */
		assert sumInteger(smalls) == sumInteger(smalls); // not recommended 
		
		// POINT - better to use equals instead of 
		assert sumInteger(smalls).equals(sumInteger(smalls));

	}

	// return reference types
	public static Integer sumInteger(List<Integer> ints) {
		Integer s = 0;
		for (Integer n : ints) {
			s += n;
		}
		return s;
	}

	// return the primitive type
	public static int sum(List<Integer> ints) {
		int s = 0;
		for (int n : ints) {
			s += n;
		}
		return s;
	}

}
