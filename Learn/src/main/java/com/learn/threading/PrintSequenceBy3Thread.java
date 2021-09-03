package com.learn.threading;

class SequencePrinter extends Thread {

	Object sharedObject;
	final static int MAX_NUMBER_SEQUENCE = 10;
	int threadNumber;
	static int number = 0;
	
	public SequencePrinter(int threadNumber, Object sharedObject) {
		this.threadNumber = threadNumber;
		this.sharedObject = sharedObject;
	}

	
	public void run() {
		while (number < MAX_NUMBER_SEQUENCE) {
		      synchronized(sharedObject) {	
		        // check again for (number < PrintNumbers.MAX_NUMBERS) otherwise one more number my be
		        // printed by another thread
		        if(number % 3 == threadNumber && number < MAX_NUMBER_SEQUENCE ){
		          System.out.println(Thread.currentThread().getName() + " - " + ++number);
		        }
		      }
		    }  
	}

}

public class PrintSequenceBy3Thread {

	public static void main(String[] args) {

		final Object sharedObject = new Object();
		SequencePrinter t1 = new SequencePrinter(0, sharedObject);
		SequencePrinter t2 = new SequencePrinter(1, sharedObject);
		SequencePrinter t3 = new SequencePrinter(2, sharedObject);
		//SequencePrinter t4 = new SequencePrinter(3, sharedObject);
		
		t1.setName("T1");
		t2.setName("T2");
		t3.setName("T3");
		//t4.setName("T4");

		t1.start();
		t2.start();
		t3.start();
		//t4.start();

	}

}
