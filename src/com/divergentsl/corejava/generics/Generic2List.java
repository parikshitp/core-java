package com.divergentsl.corejava.generics;

import java.util.ArrayList;
import java.util.List;

public class Generic2List {

	public static void main(String[] args) {
		/*
		 * The bytecode compiled from the two sources above will be identical. We say
		 * that generics are implemented by erasure because the types List<Integer>,
		 * List<String>, and List<List<String>> are all represented at run-time by the
		 * same type, List.
		 * Erasure : the process erases type parameters but adds casts.
		 * 
		 * Generics implicitly perform the same cast that is explicitly performed without generics.
		 */ 
		
		// 1. The below two are samples of with generic and without generic
		// check the casting in the second one
		List<String> words = new ArrayList<String>();
		words.add("Hello ");
		words.add("world!");
		String str = words.get(0)+words.get(1);
		assert str.equals("Hello world!");

		
		
		// 2. Without generic
		//    Check the warning that List is Raw type refereeing to generic type List<T>
		List wordsWithoutGeneric = new ArrayList();
		wordsWithoutGeneric.add("Hello ");
		wordsWithoutGeneric.add("world!");
		String str2 = ((String)wordsWithoutGeneric.get(0))+((String)wordsWithoutGeneric.get(1));
		assert str2.equals("Hello world!");

		System.out.println("Done!");

	}

}
