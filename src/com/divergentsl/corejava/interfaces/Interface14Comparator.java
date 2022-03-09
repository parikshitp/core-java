package com.divergentsl.corejava.interfaces;

import java.util.Arrays;
import java.util.Comparator;

public class Interface14Comparator {

	public static void main(String[] args) {

		/*
		 * an array of strings can be sorted since the String class implements
		 * Comparable<String>, and the String.compareTo method compares strings in
		 * dictionary order, but we want it based on the length, since String class is
		 * not ours we cannot modify it. So, we use Comparator
		 */

		String[] friends = { "Peter", "Joe", "Paul" };
		// sort the array
		Arrays.sort(friends, new LengthComparator());
		//print the array
		printArray(friends);
	}

	static void printArray(String[] strArray) {
		for (String str : strArray) {
			System.out.println(str);
		}
	}
}

// defining new calls that will do comparison based on length instead of dictionary order
class LengthComparator implements Comparator<String> {
	public int compare(String first, String second) {
		return first.length() - second.length();
	}
}
