package com.divergentsl.corejava.interfaces;

public interface Interface2Constants {

	/*
	 * 1. If we don't initialize then compilation error by default 
	 * 2. By default "public static final", even if we remove 
	 * 3. Interface can never have instance fields as it belong to individual objects
	 */
	public static final double PI_VALUE = 3.14;

	// does no matter if you apply the "public" or not, by default it is public.
	double getNamePiValue();

}

class Interface2ConstantsImpl implements Interface2Constants {

	// if we change the access modifier to restricted compiler will give error
	@Override
	public double getNamePiValue() {
		return PI_VALUE;
	}

}
