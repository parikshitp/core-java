package com.divergentsl.corejava.strings;

public class Strings2CodeUnit {
 public static void main(String[] args) {
	 
	 // Number of code units
	 int countCodeUnits = "Hello".length(); 
	 System.out.println(countCodeUnits);
	 
	 
	 //Number of codePoints 
	 // 
	 String hindiString = "रस" ;
	 int cpCount = hindiString.codePointCount(0, hindiString.length());
	 System.out.println(cpCount);
	 System.out.println(hindiString.length());
 }
}
