package com.divergentsl.corejava.lambda;

import java.util.concurrent.Executor;
import java.util.function.Supplier;

public class FunctionalInterface {
	public static void main(String[] args) {

		fuctionalInterfaceTest(() -> (1 == 1));

		
		fuctionalInterfaceTest(new FunctionalInterfaceTest() {
			
			@Override
			public Boolean test() {
				
				return 1==1;
			}
		});
		
		 
		fuctionalInterfaceTest(new Test1());

		// var fit = ()-> (1==2); // will not work as lambda require explicit target type
		
		// Object fitObj = ()-> (1==2); // You can’t even assign a lambda expression to
		// a variable of type Object as Object is not a functional interface.

		// storing in reference and then passing the reference
		// FunctionalInterfaceTest fit = () -> {return (1 == 2);};
		FunctionalInterfaceTest fit = () -> (1 == 2);
		fuctionalInterfaceTest(fit);

		// both the classes are also different(because of different impl) and objects
		// are obviously different.
		// com.divergentsl.corejava.lambda.FunctionalInterface$$Lambda$18/0x0000000840066c40@6d1e7682
		// com.divergentsl.corejava.lambda.FunctionalInterface$$Lambda$23/0x0000000840070840@3c679bde

	}
	//private volatile int start;
	private Executor executor;
	
	Supplier<Integer> incrementer( int start ) {
		/*
		 * boolean run = true; executor.execute(() -> { while (run) { // do operation }
		 * });
		 * 
		 * run = false;
		 */
		
		Supplier<Integer> supplier = () -> start;
		
		return supplier;
	}

	public static void fuctionalInterfaceTest(FunctionalInterfaceTest fi) {
		if (fi.test()) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}
}

interface FunctionalInterfaceTest {

	Boolean test();
}

class Test1 implements FunctionalInterfaceTest {

	@Override
	public Boolean test() {
		
		return 1==1;
	}
	
	
}

