package com.CSVToXML.demo;

/*class DeadLock implement{
	String s1="ashish";
	String s2="Yogendra";
}*/

public class RaiseDeadLock {

	public static void main(String[] args) {
		/*
		 * final String s1 = "ashish"; final String s2 = "Yogendra";
		 */

		Thread t1 = new Thread() {
			public void run() {
				 synchronized (String.class) {
					System.out.println("Acquired ");

					
					  try { 
						  Thread.sleep(1000);
						  } catch (InterruptedException e) { 
							  e.printStackTrace(); 
							  }
					 

					synchronized (Integer.class) {
						System.out.println("Acquired " );
					}

				}
			}
		};

		Thread t2 = new Thread() {
			public void run() {
				synchronized (Integer.class) {
					System.out.println("Acquired ");

					
					  try { 
						  Thread.sleep(1000);
						  } catch (InterruptedException e) { 
							  e.printStackTrace(); 
							  }
					 

					synchronized (String.class) {
						System.out.println("Acquired ");
					}

				}
			}
		};

		t1.start();

		t2.start();
	}

}