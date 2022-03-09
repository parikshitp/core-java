package com.divergentsl.corejava.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Generics6VarArgs {

	public static void main(String[] args) {
		List<Integer> intsList = toList(new Integer[] { 1, 2, 3 });
		
		// can pass the parameters through an array
		Integer[] ints = new Integer[] {4, 5, 6};
		addAll(intsList, ints);
		
		assert intsList.toString().equals("[1, 2, 3, 4, 5, 6]");

	}

	public static <T> List<T> toList(T[] arr) {
		List<T> list = new ArrayList<T>();
		for (T elt : arr)
			list.add(elt);
		return list;
	}

	//POINT - variable arguments generic method
	public static <T> void addAll(List<T> list, T... arr) {
		for (T elt : arr)
			list.add(elt);
	}

}
