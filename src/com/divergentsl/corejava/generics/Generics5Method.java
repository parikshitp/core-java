package com.divergentsl.corejava.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Generics5Method {

	public static void main(String[] args) {
		List<Integer> intsList = toList(new Integer[] { 1, 2, 3 });
		assert intsList.toString().equals("[1, 2, 3]");
	}

	// POINT - generic method that accepts an array of any type and converts it to
	// a list
	public static <T> List<T> toList(T[] arr) {
		List<T> list = new ArrayList<T>();
		for (T elt : arr)
			list.add(elt);
		return list;
	}

}
