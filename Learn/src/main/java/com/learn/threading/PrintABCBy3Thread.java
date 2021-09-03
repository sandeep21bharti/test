package com.learn.threading;

class Printer implements Runnable{
	static boolean first=true;
	static boolean second=false;
	static boolean third=false;
	
	Object sharedObj;
	
	public Printer(Object sharObject) {
		this.sharedObj=sharObject;
	}
	
	@Override
	public void run() {
	    	
		while(true) {
			synchronized (this) {
				try {
				Thread.sleep(2000);
				if(Thread.currentThread().getName().equals("T1")) {
					if(!first) {
						
						try {
							sharedObj.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					}else {
						System.out.println(Thread.currentThread().getName() +" -> "+ "A");
						first=false;
						third=false;
						second=true;
						sharedObj.notifyAll();
						
					}
				}
				
				if(Thread.currentThread().getName().equals("T2")){
					if(!second )  {
						try {
							sharedObj.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}else {
						System.out.println(Thread.currentThread().getName() +" -> "+ "B");
						first=false;
						third=true;
						second=false;
						sharedObj.notifyAll();
					}
				}
				
				if(Thread.currentThread().getName().equals("T3")) {
				
					if(!third ) {
						try {
							sharedObj.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}else {
						System.out.println(Thread.currentThread().getName() +" -> "+ "C");
						first=true;
						third=false;
						second=false;
						sharedObj.notifyAll();
						
					}
				}
				}catch(Exception e) {
					
				}
			}
		}
		
	}
}

public class PrintABCBy3Thread {

	public static void main(String[] args) {
		
		final Object sharedObj=new Object();
		
		Thread t1=new Thread(new Printer(sharedObj), "T1");
		Thread t2=new Thread(new Printer(sharedObj), "T2");
		Thread t3=new Thread(new Printer(sharedObj), "T3");
		t1.start();
		t2.start();
		t3.start();
		
		
	}

}
