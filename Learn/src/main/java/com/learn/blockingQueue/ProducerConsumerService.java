package com.learn.blockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerService {
	
	public static void main(String s[]) {
		//https://www.journaldev.com/1034/java-blockingqueue-example
		//https://howtodoinjava.com/java/collections/java-arrayblockingqueue/
		BlockingQueue<Message> blockingQueue=new ArrayBlockingQueue<>(10);//created a fix sized queue.
		
		Producer producer=new Producer(blockingQueue);
		Consumer consumer=new Consumer(blockingQueue);
		//starting producer to produce messages in queu
		new Thread(producer).start();
		
		 //starting consumer to consume messages from queue
		new Thread(consumer).start();
		
		System.out.println("Producer and Consumer has been started");
		
		
	}

}
