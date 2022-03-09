package com.divergentsl.corejava.interfaces;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Interface13Callback {

	public static void main(String[] args) {
		var listener = new TimePrinter();

		// construct a timer that calls the listener

		// once every second
		// TODO the listener gets added here
		var timer = new Timer(1000, listener);
		
		// fireActionPerformed(ActionEvent e) method is called when ever the event occurs
		timer.start();

		// keep program running until the user selects "OK"

		JOptionPane.showMessageDialog(null, "Quit program?");

		System.exit(0);

	}
}

class TimePrinter implements ActionListener {

	public void actionPerformed(ActionEvent event)
	{
		System.out.println("At the tone, the time is "

				+ Instant.ofEpochMilli(event.getWhen()));

		Toolkit.getDefaultToolkit().beep();

	}

}
