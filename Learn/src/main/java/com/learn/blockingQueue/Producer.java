package com.learn.blockingQueue;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

	BlockingQueue<Message> queue;

	public Producer(BlockingQueue<Message> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		Message msg;
		try {
			for (int i = 1; i < 15; i++) {
				Thread.sleep(i);
				msg = new Message("" + i);
				queue.put(msg);//This method is used to insert elements to the queue. If the queue is full, it waits for the space to be available.
				//Java BlockingQueue doesn’t accept null values and throw NullPointerException if you try to store null value in the queue
				System.out.println("Produced " + msg.getMsg());
			}

		} catch (InterruptedException e) {
			System.out.println(e);
		}

		try {
			// adding exit message
			msg = new Message("exit");
			queue.put(msg);

		} catch (InterruptedException e) {
			System.out.println(e);
		}

	}

}
