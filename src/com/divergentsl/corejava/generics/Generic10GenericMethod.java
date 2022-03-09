package com.divergentsl.corejava.generics;

import java.util.ArrayList;
import java.util.List;

public class Generic10GenericMethod {

	public static void main(String[] args) {
		List<Integer> ints = Generic10GenericMethod.toList(new Integer[] {1,2,3,4});
		
		List<String> strings = Generic10GenericMethod.toList(new String[] {"one","two"});
	}
	
	// generic method
	public static <T> List<T> toList(T[] arr) {
		List<T> list = new ArrayList<T>();
		for(T element : arr) {
			list.add(element);
		}
		return list;
	}

}
