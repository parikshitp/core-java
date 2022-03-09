package com.divergentsl.corejava.generics;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Generics5ForEach {

	public static void main(String[] args) {

		List<Integer> ints = Arrays.asList(1, 2, 3);
		int s = 0;
		for (int n : ints) {
			s += n;
		}
		assert s == 6;

		/*
		 * POINT - The above code is same as, the below code, it is added in a
		 * systematic way by the compiler
		 */
		for (Iterator<Integer> it = ints.iterator(); it.hasNext();) {
			int n = it.next();
			s += n;
		}

	}

}
