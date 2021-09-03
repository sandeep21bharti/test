package com.learn.threading;

public class MyJoinThread implements Runnable {

	@Override
	public void run() {
		  System.out.println("Child Thread priniting table of 2 first .");
		for(int i=1;i<=10;i++){
			System.out.println("2*"+i+"= "+2*i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
  public static void main(String ars[]) {
	   
	  MyJoinThread my=new MyJoinThread();
	  Thread t=new Thread(my);
	  t.start();
	  
	  try {
		  t.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  System.out.println("Main Thread priniting table of 4 secondly.");
	  
	  for(int i=1;i<=10;i++){
			System.out.println("4*"+i+"= "+4*i);
		}
	  
  }
	
	
	
}
