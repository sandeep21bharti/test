package com.learn.threading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class CounterRunnable implements Runnable{
	
	Lock lock;
	int count;
	
	public  CounterRunnable(Lock lock) {
		this.lock=lock;
	}
	

	@Override
	public void run() {
		getCount();
	}
	
	//if you see a duplicate means there is a problem with your code, but without any duplicate means it’s working fine.
	public void getCount() {
		lock.lock();
		try {
			
			System.out.println(Thread.currentThread().getName()+" increase count- "+ ++count);
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			System.out.println(Thread.currentThread().getName()+" unlock lock!");
			lock.unlock();// always call this method to unlock the lock .so that other thread get chance.
		}
		
		
	}
	
}


public class ReentrantLockExample1 {

	public static void main(String[] args) {
		
		
		final CounterRunnable counter=new CounterRunnable(new ReentrantLock());
		
		Thread t1=new Thread(counter, "T1");
		Thread t2=new Thread(counter, "T2");
		Thread t3=new Thread(counter, "T3");
		
		t1.start();
		t2.start();
		t3.start();

	}

}
