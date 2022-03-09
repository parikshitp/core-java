package com.divergentsl.corejava.lambda;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Supplier;

public class CapturingLambdaTest {

	private int start = 0;
	
	private volatile boolean run = true;

	public static void main(String[] args) {
		CapturingLambdaTest capturingLambdaTest = new CapturingLambdaTest();
		
		
		Supplier<Integer> i = capturingLambdaTest.incrementer();
		System.out.println(i.get());
		
		
		capturingLambdaTest.instanceVariableMultithreading();
	}

	// below will give error

	Supplier<Integer> incrementer(/* int start */) {
		
		return () -> start++;
	}
	

	public void instanceVariableMultithreading() {
	   //boolean run = true;

		ExecutorService executor = Executors.newSingleThreadExecutor();
		executor.execute(() -> {
			while (run) {
				// do operation
				run = false;
			}
		});
		 run = false;
	}

}
