package com.divergentsl.corejava.lambda;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.swing.Timer;

public class PredicateTest {

	public static void main(String[] args) {
		  
		ArrayList<String> list = new ArrayList<>();
		list.add("first");
		list.add("Second");
		list.add(null);
		list.add("third");
		list.add("fourth");
		
		System.out.println("size before" + list.size());
		
		list.removeIf(e -> e == null);
		
		System.out.println("size afterwards" + list.size());
		
		//---------- Predicate ------------
		
		LocalDate day = null;
		
		LocalDate hireDay = Objects.requireNonNullElseGet(day, () -> LocalDate.of(2017, 1, 1));

		System.out.println("Hire Day:" + hireDay);
		
		//---------- Method reference ------
		
		/*
		 * //There are ten overloaded println methods in the PrintStream class (of
		 * which System.out is an instance). The compiler needs to figure out which
		 * one to use, depending on context. In our example, the method reference
		 * System.out::println must be turned into an ActionListener instance with a
		 * method
		 * 
		 * void actionPerformed(ActionEvent e) 
		 * 
		 * the println(Object x) method is selected from the ten overloaded println 
		 * methods since Object is the best match for ActionEvent. When the actionPerformed 
		 * method is called, the event object is printed.
		 */

		//var timer = new Timer(1000, event -> System.out.println(event));

		var timer = new Timer(1000, System.out::println);

		
		///------
		
		/*
		 * The Runnable functional interface has a single abstract method with no
		 * parameters void run() In this case, the println() method with no parameters
		 * is chosen. Calling task.run() prints a blank line to System.out.
		 */
		Runnable task = System.out::println;
		
		//--------
		
		String[] strings = new String[] {"","",""};
		Arrays.sort(strings, String::compareToIgnoreCase);


	}

}
