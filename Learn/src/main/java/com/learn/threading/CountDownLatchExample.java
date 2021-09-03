package com.learn.threading;

import java.util.concurrent.CountDownLatch;

class MyTask implements Runnable{
	
	CountDownLatch latch;
	
	public MyTask(CountDownLatch latch) {
		this.latch=latch;
			
	}

	@Override
	public void run() {
		try {
			System.out.println(Thread.currentThread().getName()+ " started..");
			
			Thread.sleep(1000);
			
			
			  System.out.println(latch.getCount());
			  
			  
			//reduce count of CountDownLatch by 1
			latch.countDown();/*Decrements the count of the latch, releasing all waiting threads
			if the count reaches zero */
			System.out.println(Thread.currentThread().getName() + " finished");
			
			
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
}



public class CountDownLatchExample {

	public static void main(String[] args) {
		
		CountDownLatch latch =new CountDownLatch(3);//3 Child threads.
		MyTask m1=new MyTask(latch);
		MyTask m2=new MyTask(latch);
		MyTask m3=new MyTask(latch);
		
		Thread t1=new Thread(m1, "T1");
		Thread t2=new Thread(m1, "T2");
		Thread t3=new Thread(m1, "T3");
		
		t1.start();
		t2.start();
		t3.start();
		
		
		try {
			latch.await();  //Causes the current thread to wait until the latch has counted down to zero.
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 // Main thread has started
        System.out.println(Thread.currentThread().getName() +" has finished");
	}

}
