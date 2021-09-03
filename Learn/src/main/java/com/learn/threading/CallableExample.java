package com.learn.threading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableFactorialTask implements Callable<Integer> {

	private int num;

	public CallableFactorialTask(int num) {
		this.num = num;
	}

	@Override
	public Integer call() throws Exception {
		int result = 1;

		for (int count = num; count >= 1; count--) {

			result = result * count;
		}
		return result;
	}

}

public class CallableExample {

	public static void main(String[] args) {

		CallableFactorialTask task = new CallableFactorialTask(5);
		try {
			ExecutorService servcie = Executors.newScheduledThreadPool(1);

			Future<Integer> future = servcie.submit(task); //submit method takes input of Callable<V> and return
			// Future<V> type. where as service.execute() takes Runnable type paramametr.
			System.out.println("Factorial of number="+future.get());
			servcie.shutdown();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
