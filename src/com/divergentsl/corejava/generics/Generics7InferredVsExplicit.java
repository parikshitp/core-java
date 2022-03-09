package com.divergentsl.corejava.generics;

import java.util.ArrayList;
import java.util.List;

public class Generics7InferredVsExplicit {

	public static void main(String[] args) {
		/*
		 * POINT - the type parameter to the generic method is inferred, but it may also
		 * be given explicitly i.e. .<Integer>toList()
		 * 
		 * POINT -  When to use explicit? -  in a call to a generic method, if there
					are one or more arguments that correspond to a type parameter and they all have the
					same type then the type parameter may be inferred; if there are no arguments that
					correspond to the type parameter or the arguments belong to different subtypes of the
					intended type then the type parameter must be given explicitly.

		 */
		List<Integer> ints = Generics7InferredVsExplicit.<Integer>toList(); // no arguments given
		List<Object> objs = Generics7InferredVsExplicit.<Object>toList(1, "two"); // arguments belong to different subtypes

		// implicit
		List<Integer> intsImplicit = Generics7InferredVsExplicit.toList();
		List<Object> objsImplicit = Generics7InferredVsExplicit.toList(1, "two");
		
		/*
		 * POINT - The Java grammar requires that type parameters may appear only in
		 * method invocations that use a dotted form, below will give compile time error
		 */
		// List<Integer> ints = <Integer>toList(); // compile-time error

	}

	public static <T> List<T> toList(T... arr) {
		List<T> list = new ArrayList<T>();
		for (T elt : arr)
			list.add(elt);
		return list;
	}
}
