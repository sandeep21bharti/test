package com.learn.lambda;

public class ThreadExampleWithMethodRefrence {

	public static void main(String[] args) {
		
		//First we create a Thread by lambda expression.
		/*
		 * Runnable runable=()->{
		 * 
		 * for(int count=0;count<5;count++)
		 * System.out.println("Child thread executed.."); };
		 * 
		 * Thread thread=new Thread(runable); thread.start();
		 * System.out.println("Main  thread executed..");
		 */
		
		
		/*To replace the thread created above by Lambda expression we will use Method reference approach.
		for this we will create a method of same type of run()*/
		Runnable runableByMethodRefrence = new ThreadExampleWithMethodRefrence()::runBrother;
		Thread threadsecond=new Thread(runableByMethodRefrence);
		threadsecond.start();
		System.out.println("Main  thread executed..");
		
	}
	
	/*
	 * Method refrence- To refer the another method by using :: 
	 * below is the some conditions should be match to use method Reference:
	 *  1) The both the methods of refering and referrer should have same argumnets and same dataType. 
	 *  2)No need of same method. 
	 *  3) no need of same return type.
	 *  4) No need of same modifiers. 
	 *  5) It can be static or non-static also.
	 *  	 Benefit- The code reusablitity
	 */
	public  void runBrother() {
		      for(int count=0;count<5;count++)
			   System.out.println("Child thread executed..");
	}
	
	

}
