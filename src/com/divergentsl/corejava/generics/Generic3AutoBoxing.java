package com.divergentsl.corejava.generics;

import java.util.Arrays;
import java.util.List;

public class Generic3AutoBoxing {

	public static void main(String[] args) {
		
		/*
		 * POINT - Why does the argument have type List<Integer> and not List<int>? Because type
		 * parameters must always be bound to reference types, not primitive types.
		 */
		List<Integer> bigs = Arrays.asList(1,2,3);
		assert sumInteger(bigs) == sum(bigs);
		assert sumInteger(bigs) != sumInteger(bigs); // not recommended
		
		// POINT - will give assertion error as reference types would be compared
		//assert sumInteger(bigs) == sumInteger(bigs);  
	}
	
	// return the reference type
	/*
	 * POINT - This code compiles but performs a lot of needless work. Each iteration of the
	 * loop unboxes the values in s and n, performs the addition, and boxes up the
	 * result again.
	 * 
	 * POINT - Measurements show that this version is about 60 percent
	 * slower than the "sum" method below.

	 */
	public static Integer sumInteger(List<Integer> ints) {
		Integer s = 0;
		for (Integer n : ints) { s += n; }
		return s;
		}

	// return the premitive type 
	public static int sum (List<Integer> ints) {
		int s = 0;
		for (int n : ints) { s += n; }
		return s;
		}


}
