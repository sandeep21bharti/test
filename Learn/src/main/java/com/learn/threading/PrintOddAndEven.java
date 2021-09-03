package com.learn.threading;

class MyNumber implements Runnable {

	Object sharedObj;
	static int Max_Number = 10;
	static int count = 1;
	int remainder;

	public MyNumber(Object shared, int remainder) {
		this.sharedObj = shared;
		this.remainder = remainder;
	}

	@Override
	public void run() {

		while (count < Max_Number) {

			synchronized (sharedObj) {

				if (count % 2 != remainder) {
					try {
						sharedObj.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				} else {
					System.out.println(Thread.currentThread().getName() + " -" + count);
					count++;
					sharedObj.notifyAll();
				}

			}

		}

	}

}

public class PrintOddAndEven {

	public static void main(String[] args) {

		final Object obj = new Object();

		Thread t1 = new Thread(new MyNumber(obj, 0), "Even");
		Thread t2 = new Thread(new MyNumber(obj, 1), "Odd");

		t1.start();
		t2.start();

	}

}
