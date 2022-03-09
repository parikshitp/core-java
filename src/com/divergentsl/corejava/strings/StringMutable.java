package com.divergentsl.corejava.strings;

import java.lang.reflect.Field;

public class StringMutable {

	public static void main(String[] args)
			throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		String Stringno = "CORE123";
		Field field = String.class.getDeclaredField("value");
		field.setAccessible(true);
		Object obj = field.get(Stringno);
		System.out.println(obj);
		//	char[] value = (char[]) field.get(Stringno);
		byte[] value = (byte[]) field.get(Stringno);
		value[0] = 'X';
		value[1] = 'Y';
		value[2] = 'Z';
		System.out.println(Stringno);
		
		Integer.parseInt("011");
		System.out.println("1.0.1".replaceAll("\\.",""));

	}

}
