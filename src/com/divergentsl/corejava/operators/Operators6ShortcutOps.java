package com.divergentsl.corejava.operators;

public class Operators6ShortcutOps {

	public static void main(String[] args) {
		int x = 0;
		
		// IMPORTANT the casting is automatically added to "int"  (int)(x + 3.5)
		x +=3.5; // the variable needs to be initialized first we cannot do "int x += 3.5"

		System.out.println(x);
		int n = 8, m =8;
		int a = 2 * ++m; // now a is 16, m is 8
		int b = 2 * n++; // now b is 14, n is 8
		
		System.out.println(a);
		System.out.println(b);
		
	}

}
