package com.learn.ThreadPoolexecutors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyWorker implements Runnable{
    
	String str;
	
	 public MyWorker(String str) {
		this.str=str;
		}
	
	@Override
	public void run() {
		
		try {
			System.out.println(Thread.currentThread().getName()+" Started...");
			processCommand();
			System.out.println(Thread.currentThread().getName()+" ended...");  
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

	private void processCommand() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

public class ExecutorServiceTest {

	public static void main(String[] args) {
      ExecutorService service=Executors.newFixedThreadPool(4);
      for(int i=1;i<10;i++) {
    	  
    	  Runnable runnable=new MyWorker(""+i);
    	  service.execute(runnable);
    	  
      }
      service.shutdown();
      //System.out.println("after shut down..");
      
      while(!service.isTerminated()) {
    	  //System.out.println(service.isTerminated());
      }
      System.out.println("Finished all threads");
	}

}
