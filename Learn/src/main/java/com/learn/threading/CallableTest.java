package com.learn.threading;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class CallableTask implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		int randomNumber = new Random().nextInt(20);

		Thread.sleep(1000);
		return randomNumber;
	}

}

public class CallableTest {

	public static void main(String[] args) {

		// FutureTask is a concrete class that
		// implements both Runnable and Future
		FutureTask[] futureTask = new FutureTask[5];

		for (int count = 1; count <= 4; count++) {

			Callable callableTask = new CallableTask();

			// Create the FutureTask with Callable
			futureTask[count] = new FutureTask(callableTask);
			
			 /* As we Know FutureTask class is concrete class for Runnable and Callable Interface,
			  create Thread with FutureTask*/
		      Thread t = new Thread(futureTask[count]);
		      t.start();

		}
		
		for (int i = 1; i <= 4; i++)
	    {
		/*As we Know FutureTask class is concrete class for Runnable and Callable Interface.*/
			  
	      try {
			System.out.println(futureTask[i].get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  
	      // This method blocks till the result is obtained
	      // The get method can throw checked exceptions
	      // like when it is interrupted. This is the reason
	      // for adding the throws clause to main
	    }

	}

}
