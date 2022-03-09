package com.divergentsl.corejava.generics;

import java.util.ArrayList;
import java.util.List;

public class Generics8Performance {

	public static void main(String[] args) {
		
		List<Integer> ints = new ArrayList<Integer>();
		
		for(int i = 0 ; i < 100_000 ; i++) {
			ints.add(i);
		}
		
		Long startTime = System.currentTimeMillis();
		sum(ints);
		Long endTime = System.currentTimeMillis();
		
		System.out.println("Time difference(int)" + (endTime - startTime));
		
		startTime = System.currentTimeMillis();
		sumInteger(ints);
		endTime = System.currentTimeMillis();
		
		System.out.println("Time difference(Integer)" + (endTime - startTime));
		
		
	}
	
	public static int sum(List<Integer> ints) {
		int sum = 0;
		for(int i : ints) {
			sum += i;
		}
		return sum;
	}
	
	public static Integer sumInteger(List<Integer> ints) {
		Integer sum = 0;
		for(Integer i : ints) {
			sum += i;
		}
		return sum;
	}
}
