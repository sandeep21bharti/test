package com.learn.threading;
import java.util.concurrent.locks.ReentrantLock;

public class BookTicket {

    ReentrantLock lock = null;

    public BookTicket(ReentrantLock lock) {
        this.lock = lock;
    }

    int totalTickets = 10;

    int ticketsLeft = totalTickets;

    Integer bookTicket() throws InterruptedException {
        Thread.sleep(1500);
        
        lock.lock();
//      synchronized (this) {
          Thread.sleep(1500);
          try {
              if (ticketsLeft == 0) {
                  throw new Exception("All tickets are booked");
              }
              ticketsLeft = ticketsLeft - 1;
          }catch (Exception e){
        	  
             e.printStackTrace();
             return null;
          } finally {
              lock.unlock();
          }
            
            ticketsLeft = ticketsLeft - 1;
     // }
        
        return ticketsLeft;
    }

    Integer cancelTicket() throws InterruptedException {
        Thread.sleep(1000);
        lock.lock();
            if(ticketsLeft == 10){
                try {
                    throw new Exception("Haven't booked any tickets");
                } catch (Exception e) {
                    e.printStackTrace();
                    return null;
                }
            }
            ticketsLeft = ticketsLeft + 1;
        lock.unlock();
        return ticketsLeft;
    }

    int getTicketsLeft(){
        return ticketsLeft;
    }
}