package com.divergentsl.corejava.generics;

import java.util.Arrays;
import java.util.List;

public class Generics9Caching {

	public static void main(String[] args) {
		List<Integer> bigs = Arrays.asList(100, 200, 300);

		assert sumInteger(bigs) == sum(bigs);
		assert sumInteger(bigs) != sumInteger(bigs); // this will compare references
		
		List<Integer> smalls = Arrays.asList(1, 2, 3);
		
		assert sumInteger(smalls) == sum(smalls);
		// caching effect
		assert sumInteger(smalls) == sumInteger(smalls); // this will compare references
		
		System.out.println("All Good!!!");

	}

	public static int sum(List<Integer> ints) {
		int sum = 0;
		for (int i : ints) {
			sum += i;
		}
		return sum;
	}

	public static Integer sumInteger(List<Integer> ints) {
		Integer sum = 0;
		for (Integer i : ints) {
			sum += i;
		}
		return sum;
	}
}
