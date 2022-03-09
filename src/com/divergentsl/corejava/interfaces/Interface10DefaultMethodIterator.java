package com.divergentsl.corejava.interfaces;

import java.util.ArrayList;
import java.util.Iterator;

public class Interface10DefaultMethodIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("a");

		// Check the default methods in the iterator interface
		Iterator<String> itr = arrayList.iterator();

		/*
		 * default void remove() { throw new UnsupportedOperationException("remove"); }
		 */
	}

}
