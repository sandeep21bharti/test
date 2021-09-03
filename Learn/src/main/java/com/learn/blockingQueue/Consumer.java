package com.learn.blockingQueue;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

     BlockingQueue<Message>queue;
	
	public Consumer(BlockingQueue<Message>queue) {
		this.queue=queue;
	}
	
	@Override
	public void run() {
		Message msg;
		try {
			
			//consuming messages until exit message recived  that was put by the producer.
			//take() -this method retrieves and remove the element from the head of the queue. If queue is empty it waits for the element to be available.
			while((msg=queue.take()).getMsg()!="exit") {
				Thread.sleep(2);
				System.out.println("Consumed "+msg.getMsg());
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
