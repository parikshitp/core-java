package com.divergentsl.corejava.generics;

import java.util.Comparator;

public class Generics14ComparatorStringLength {

	public static void main(String[] args) {

		// string comparator based on length of the string
		Comparator<String> sizeOrder = new Comparator<String>() {
			public int compare(String s1, String s2) {
				return s1.length() < s2.length() ? -1 : s1.length() > s2.length() ? 1 : s1.compareTo(s2);
			}
		};

	}

}
