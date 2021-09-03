package com.learn.lambda;

public class ThreadByLambda {

	public static void main(String[] args) {
		//Annonmous Thread
	     Runnable runnable= new Runnable() {
			
			@Override
			public void run() {
            System.out.println("Thread is running........");				
			}
		  };
		  Thread t1=new Thread(runnable);
		  t1.start();
		  
		  
		  //Thread by Lambda
		  Runnable runable=()-> System.out.println("Lamabda thread running");
		  Thread t2=new Thread(runable);
		  t2.start();
	}

}
