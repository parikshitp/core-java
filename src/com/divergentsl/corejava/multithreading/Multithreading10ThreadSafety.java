package com.divergentsl.corejava.multithreading;

import java.time.LocalDateTime;

public class Multithreading10ThreadSafety implements Runnable {
	
	LocalDateTime date;
	
	public Multithreading10ThreadSafety(LocalDateTime date) {
		
		this.date = date;
	}
	
	@Override
	public void run() {
		//Add 10 years
		date = date.plusYears(10);
		
		System.out.println("Date:" + date);
	}
	

	//--------------------------------------------------------------------------------
	
	
	public static void main(String[] args) {
		
		// in this case both share state so there will be race condition
		Multithreading10ThreadSafety multithreading10ThreadSafety = new Multithreading10ThreadSafety(LocalDateTime.of(2010,12,1,0,0));
		
		Thread firstThread = new Thread(multithreading10ThreadSafety);

		Thread secondThread = new Thread(multithreading10ThreadSafety);
		
		firstThread.start();
		
		secondThread.start();

	}

}
