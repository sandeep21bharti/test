package com.learn.threading;
import java.util.concurrent.locks.ReentrantLock;

public class BookTicketApplication {

    public static void main(String[] args){
        ReentrantLock lock = new ReentrantLock(false);
        BookTicket bookTicket = new BookTicket(lock);
        // Threads for booking ticket
        for (int i=0; i<20;i++){
            int a = i;
            new Thread(() -> {
                try {
                    System.out.println(a + "Booking Ticket Number is " + bookTicket.bookTicket());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
        // Threads for canceling the ticket
		/*
		 * for (int i=0; i<10;i++){ int a = i; new Thread(() -> { try {
		 * System.out.println(a+ "Canceling Ticket Number is " +
		 * bookTicket.cancelTicket()); } catch (InterruptedException e) {
		 * e.printStackTrace(); } }).start(); }
		 */
    }
}