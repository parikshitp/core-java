package com.divergentsl.corejava.generics;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Generics13Comparable {

	public static void main(String[] args) {
		Integer maxInt = Generics13Comparable.<Integer>max(Arrays.asList(new Integer[] { 1, 2, 3, 4 }));
		String maxStr = Generics13Comparable.<String>max(Arrays.asList(new String[] { "zero", "one", "two", "three" }));
		// below will not work as Number does not implement Comparable
		// Number maxNum = Generics13Comparable.<Number>max(Arrays.asList(new Number[]
		// {2.3,1.1}));
		System.out.println(maxInt + " " + maxStr);
	}

	public static <T extends Comparable<T>> T max(Collection<T> coll) {
		T result = coll.iterator().next();
		for (T element : coll) {
			if (result.compareTo(element) < 0)
				result = element;
		}
		return result;
	}
	
	/* More efficient version as it requires iterator only once
	 * public static <T extends Comparable<T>> T max(Collection<T> coll) {
	 * Iterator<T> it = coll.iterator(); T candidate = it.next(); while
	 * (it.hasNext()) { T elt = it.next(); if (candidate.compareTo(elt) < 0)
	 * candidate = elt; } return candidate; }
	 */
}
