package com.divergentsl.corejava.gc;

import java.lang.ref.Cleaner;

public class CleanerDemo {

	public static void main(String args[]) {
	      System.out.println("Starting...");
	      Cleaner cleaner = Cleaner.create();
	      if(true) {
	    	  CleanerDemo myObject = new CleanerDemo();
	            cleaner.register(myObject, new State());    // register cleaner
	      }
	      for(int i = 1; i <= 10000; i++) {
	         String[] largeObject = new String[1000];
	         try {
	            Thread.sleep(1);
	         } catch(InterruptedException e) {
	              e.printStackTrace();
	         }
	      }
	   }
	   private static class State implements Runnable {
	      public void run() {
	         System.out.print("Cleaning action");
	      }
	   }

}
