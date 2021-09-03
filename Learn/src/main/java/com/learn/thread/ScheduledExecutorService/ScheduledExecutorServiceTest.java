package com.learn.thread.ScheduledExecutorService;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


class RunnableTask implements Runnable{
	 
private String taskName;

   public RunnableTask(String s){
       this.taskName=s;
   }

   @Override
   public void run() {
       System.out.println(Thread.currentThread().getName()+" Start Time for "+taskName+" "+new Date());
       // Process task here
       try {
           Thread.sleep(5000);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
       System.out.println(Thread.currentThread().getName()+" End Time for "+taskName+" "+new Date());
   }

   @Override
   public String toString(){
       return this.taskName;
   }
}


public class ScheduledExecutorServiceTest {

	public static void main(String[] args) {
		System.out.println("Current Time = "+new Date());
        // Created ScheduledThreadPoolExecutor object
		ScheduledExecutorService scheduledThreadPool =Executors.newScheduledThreadPool(3);
		for(int i=1; i<=3; i++){
            try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            RunnableTask task = new RunnableTask("Task "+i);
            scheduledThreadPool.scheduleWithFixedDelay(task,5,10,TimeUnit.SECONDS);
        }
 
        // Adding some delay
        try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 
        scheduledThreadPool.shutdown();
        while(!scheduledThreadPool.isTerminated()){
            //wait for all tasks to finish
        }
        System.out.println("Completed all threads");
    }
	

}
