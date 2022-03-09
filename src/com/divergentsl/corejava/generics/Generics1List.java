package com.divergentsl.corejava.generics;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Generics1List {

	public static void main(String[] args) {
		iterateArray();
		iterateNonGenricList();
		iterateGenricList();
		System.out.println("Done!!");
	}

	// Use of array not flexible with increase or decrease in elements
	public static void iterateArray() {
		int[] ints = new int[] { 1, 2, 3 };
		int s = 0;
		for (int i = 0; i < ints.length; i++) {
			s += ints[i];
		}
		// TODO If assertion is enabled, then the assert statement will be evaluated.
		// Otherwise, it does not get executed.  vm argument –ea NOT –enableassertions
		assert s == 6;

	}

	// the code is flexible but is lengthy
	public static void iterateNonGenricList() {
		List ints = Arrays.asList(new Integer[] { new Integer(1), new Integer(2), new Integer(3) });
		int s = 0;
		for (Iterator it = ints.iterator(); it.hasNext();) {
			int n = ((Integer) it.next()).intValue();
			s += n;
		}
		assert s == 6;
	}

	// Use of generic make is precise
	public static void iterateGenricList() {
		List<Integer> ints = Arrays.asList(1, 2, 3);
		int s = 0;
		for (int n : ints) {
			s += n;
		}
		assert s == 6;
	}

}
