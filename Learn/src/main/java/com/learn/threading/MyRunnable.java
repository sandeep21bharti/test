package com.learn.threading;

public class MyRunnable implements Runnable
{
	
	public void run() {
		System.out.println("inside the my runnable");
	}

	public static void main(String[] args) {
		
		MyRunnable r=new MyRunnable();
		Thread t=new Thread(r);
		t.start();
		System.out.println("inside the Main()...");
	}

}
