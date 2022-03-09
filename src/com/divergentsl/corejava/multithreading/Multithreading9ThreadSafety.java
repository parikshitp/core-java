package com.divergentsl.corejava.multithreading;

import java.time.LocalDateTime;

public class Multithreading9ThreadSafety implements Runnable {
	
	LocalDateTime date;
	
	public Multithreading9ThreadSafety(LocalDateTime date) {
		
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
		
		// in this case both have their own state so thing like race condition
		
		Thread firstThread = new Thread(new Multithreading9ThreadSafety(LocalDateTime.of(2010,12,1,0,0)));

		Thread secondThread = new Thread(new Multithreading9ThreadSafety(LocalDateTime.of(1990,12,1,0,0)));
		
		firstThread.start();
		
		secondThread.start();

	}

	

}
