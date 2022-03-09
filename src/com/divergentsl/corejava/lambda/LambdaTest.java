package com.divergentsl.corejava.lambda;

import java.util.Arrays;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class LambdaTest {

	public static void main(String[] args) {
		String[] planets = { "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto" };

		// lambda expression
		Arrays.sort(planets, (String first, String second) -> first.length() - second.length());

		// with inferred type
		// While debugging at this line we see that Java actually provide an object of
		// the Comparator at the runtime to the method
		Arrays.sort(planets, (first, second) -> first.length() - second.length());

		// single statement without {} and ()
		var timer = new Timer(1000, event -> System.out.println("Date" + new Date()));
		timer.start();

		JOptionPane.showMessageDialog(null, "Quit Program?");
		System.exit(0);

	}

}
