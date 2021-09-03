package com.learn.threading;

class ThreadsPrintOneByOneRunnable implements Runnable {

	static Integer count=0;
	int remainder;
	Object sharedObject;

	ThreadsPrintOneByOneRunnable(int remainder, Object shared) {
		this.remainder = remainder;
		this.sharedObject = shared;
	}

	@Override
	public void run() {
		//System.out.println("outside - " + Thread.currentThread().getName() + "  count is " + count);
		synchronized (sharedObject) {
			while (count <= 15) {

				if (count % 2 != remainder) {
					
					try {
						sharedObject.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} else {
					System.out.println("Printed by - " + Thread.currentThread().getName() + " :" + count);
					count++;
					sharedObject.notifyAll();
				}
			}
		}
	}
}

public class PrintBy2Threads {

	public static void main(String[] args) {

		Object sharedObject = new Object();
		Thread thread1 = new Thread(new ThreadsPrintOneByOneRunnable(0, sharedObject));
		Thread thread2 = new Thread(new ThreadsPrintOneByOneRunnable(1, sharedObject));
		

		thread1.setName("Thread 1");
		thread2.setName("Thread 2");

		thread1.start();
		thread2.start();
	}
}