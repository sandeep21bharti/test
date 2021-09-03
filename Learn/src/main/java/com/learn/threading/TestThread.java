package com.learn.threading;

public class TestThread extends Thread{
	
	public void run() {
		System.out.println("inside the run()...");
	}

	public static void main(String[] args) {
		 TestThread tt=new TestThread();
		 Thread t=new Thread(tt);//This way is also valid  way.
		 t.start();
		 System.out.println("Thread name="+t.getName());
		 System.out.println(" main thread name...."+Thread.currentThread().getName());

	}

}
