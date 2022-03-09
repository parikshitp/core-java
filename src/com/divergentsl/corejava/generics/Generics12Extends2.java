package com.divergentsl.corejava.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Generics12Extends2 {

	public static void main(String[] args) {
		List<Integer> ints = new ArrayList<Integer>();
		ints.add(1);
		ints.add(2);
		List<? extends Number> nums = ints;
		//nums.add(3);
		
		List<Object> objs = Arrays.<Object>asList(2, 3.14, "four");
		List<Integer> integers = Arrays.asList(5, 6);
		Collections.copy(objs, integers);
		assert objs.toString().equals("[5, 6, four]");


	}

}
