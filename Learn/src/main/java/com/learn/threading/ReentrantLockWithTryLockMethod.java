package com.learn.threading;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Myresources implements Runnable
{
	private int count;
	private Lock lock;
	
	public Myresources(Lock lock) {
		this.lock=lock;
	}

	@Override
	public void run() {
		getCount();
	}
	
	    //if you see a duplicate means there is a problem with your code, but without any duplicate means it’s working fine.
		public void getCount() {
		try {
			lock.tryLock(1, TimeUnit.SECONDS);  //we can use tryLock() to make sure thread waits for specific time only.
			System.out.println(Thread.currentThread().getName()+" increase count- "+ ++count);
			
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			System.out.println(Thread.currentThread().getName()+" unlock lock!");
			lock.unlock();
		}
	}
}

public class ReentrantLockWithTryLockMethod {

	public static void main(String[] args) {
    final Myresources resource=new Myresources(new ReentrantLock());
		
		Thread[] thread=new Thread[5];
		 for (int i = 0; i < 5; i++)
	      {
	         thread[i] = new Thread(resource, "Thread " + i);
	      }
	      for (int i = 0; i < 5; i++)
	      {
	         thread[i].start();
	      }
	}

}
