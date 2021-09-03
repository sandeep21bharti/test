package com.learn.futureAndcompletableFuture;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureTest1 {

	public static void main(String[] args) {

		ExecutorService service=Executors.newFixedThreadPool(1);
		Future<String>future=service.submit(new MyCallable());
		
		// This line executes immediately
        System.out.println("Do something else while callable is getting executed");

		
		service.shutdown();
		while(!service.isShutdown()) {
			System.out.println("Service is still running.");
		}
		
		try {
			System.out.println("service completed now="+future.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}



class MyCallable implements Callable<String>{
	
	@Override
	public String call() throws Exception {
		Thread.sleep(1000);
		return "Response returned by callable";
	}
	
}