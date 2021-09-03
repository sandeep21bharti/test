package com.learn.threading;

import java.text.SimpleDateFormat;

class MyThread implements Runnable{
	
	ThreadLocal<SimpleDateFormat>threadLocal;
	
	public MyThread(ThreadLocal<SimpleDateFormat> threadLocal) {
		this.threadLocal=threadLocal;
	}

	/*here we are not using synchronized keyword even Both T1 and T2 use the same shared ThreadLocal object ,because ThreadLocal 
	is Thread safe.Each thread will read and write there own copy of ThreadLocal object.*/
	@Override
	public void run() {
		try {
			
		    System.out.println(("Thread Name= "+ Thread.currentThread().getName() +" date format - "+threadLocal.get().toPattern()));
		    changeDefaultDateFormat(this.threadLocal);    
		
		
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	
	public void changeDefaultDateFormat(ThreadLocal<SimpleDateFormat> threadLocal){
		threadLocal.set(new SimpleDateFormat());
		System.out.println("Thread Name= "+Thread.currentThread().getName()+" date format - "+threadLocal.get().toPattern());
		
	}
	
}

public class ThreadLocalExample {

	public static void main(String[] args) throws InterruptedException {
		
		
    /* Here Make the single object of ThreadLocal and set the intial value here .In ThreadLocal 
     * we do not need to use the synchronized keyword in run() because in ThreadLocal is Thread safe and each 
     * thread will work on seperate copy of valriable.
     */
	final ThreadLocal<SimpleDateFormat> threadLocal=new ThreadLocal<SimpleDateFormat>() {
			
			@Override
			protected SimpleDateFormat initialValue() {
				return   new SimpleDateFormat("yyyyMMdd HHmm");
			}
			
		};
		
		
		//We have create two threads with single ThreadLocal variable.
		MyThread m1=new MyThread(threadLocal);
		MyThread m2=new MyThread(threadLocal);
		
		new Thread(m1,"T1" ).start();
		Thread.sleep(3000);
		new Thread(m1,"T2" ).start();;
		
		/*As you can see from the output that T1 has changed the initial value of date format
		 but still T2  intial value is not changed before changing its format */
		 
		
		
	}

}
