package com.CSVToXML.demo;

public class GenerateDeadlock {

	public static void main(String[] args) {
 String name="st";
		Thread t1=new Thread(new Runnable() {
			
			@Override
			public void run() {
				synchronized(String.class) {
					System.out.println("first thread first method");
				
				try{
					
					Thread.sleep(1000);
				}
				catch(Exception e) {
					
				}
			synchronized(Integer.class) {
				System.out.println("first thread second method");
			}	
				}
				
			}
		});
		
		Thread t2=new Thread(new Runnable() {
			
			@Override
			public void run() {
				synchronized(String.class) {
					System.out.println("second thread first method");
				
				try {
					Thread.sleep(1000);
				}
				catch(InterruptedException e) {
					
				}
				synchronized(Integer.class) {
					System.out.println("second thread second metod");
				}
				}
				
			}
		});
		t1.start();
		t2.start();

	}

}
