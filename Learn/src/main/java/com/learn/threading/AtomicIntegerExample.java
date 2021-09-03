package com.learn.threading;

import java.util.concurrent.atomic.AtomicInteger;

class Counter implements Runnable {

	int number ;
	AtomicInteger atomicNumber;
	
	 public Counter(int number, AtomicInteger atomicNumber ) {
		 this.number=number;
		 this.atomicNumber=atomicNumber;
	 }
	

	@Override
	public   void run() {
		//System.out.println(Thread.currentThread().getName());
		int max = 100000;
        // incrementing counter
        // total of max times
        for (int i = 0; i < max; i++) {
            number++;
            atomicNumber.addAndGet(1);//add the given value return updated value.
        }
		
	}

	public int getNumber() {
		return number;
	}

	public AtomicInteger getAtomicNumber() {
		return atomicNumber;
	}

}

public class AtomicIntegerExample {

	public static void main(String[] args) throws InterruptedException {
		// Instance of Counter Class
        Counter c = new Counter(0,new AtomicInteger(0));
  
        // Defining Two different threads
        Thread first = new Thread(c, "First");
        Thread second = new Thread(c, "Second");
  
        // Threads start executing
        first.start();
        second.start();
        
        // main thread will wait for both
        // threads to complete execution
        first.join();
        second.join();
        
        // Printing final value of Normal and atomic  variable
        // Normal primitive  value may be incorrect final value but atomic variable will be correct final value
        //if you make run method synchronized then primitive final values should also correct.
        System.out.println("Normal int value = "+c.number +" Atomic Integer ="+c.atomicNumber);
	}

}
