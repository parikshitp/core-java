package com.divergentsl.corejava.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Generics11Extends {

	public static void main(String[] args) {
		
		//interface Collection<E> {
		// public boolean addAll(Collection<? extends E> c);
		// ....}

		List<Number> nums = new ArrayList<Number>();
		List<Integer> ints = Arrays.asList(1, 2);
		List<Double> dbls = Arrays.asList(2.78, 3.14);
		nums.addAll(ints);
		nums.addAll(dbls);
		assert nums.toString().equals("[1, 2, 2.78, 3.14]");
	}
}
