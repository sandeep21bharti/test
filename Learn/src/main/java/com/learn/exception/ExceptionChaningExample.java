package com.learn.exception;

public class ExceptionChaningExample {

	public static void main(String[] args) {
     try {
		//Creating an Exception.
		NumberFormatException nfe=new NumberFormatException("Number format");
		
		// Setting a cause of the exception
		nfe.initCause(new NullPointerException("This is actual cause of the exception"));
		
		// Throwing an exception with cause.
		throw nfe;
     }catch(NumberFormatException e){
    	 System.out.println(e);
    	 
    	 // Getting the actual cause of the exception
    	 System.out.println(e.getCause());
     }
		
	}
	
	

}
