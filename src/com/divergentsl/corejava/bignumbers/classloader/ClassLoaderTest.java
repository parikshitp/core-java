package com.divergentsl.corejava.bignumbers.classloader;

public class ClassLoaderTest {

	public static void main(String[] args) {
		
		// this will retrun null which repreent the bootstrap class loader, check getClassLoader javadoc
		System.out.println(System.class.getClassLoader());
		
		// this will be loaded by application classloader
		System.out.print(Testing.class.getClassLoader());
	}
}

class Testing {
	
}