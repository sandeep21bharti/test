package com.learn.basicprogram;

public class ExceptionTest {
	
	private void runMain(){
	    try{
	        try{
	            System.out.println("Hi ");
	            throw new Exception("Hello");
	        }
	        finally{
	            System.out.println("inner finally");
	        }
	    }
	    catch(Exception e){
	        System.out.println(e.getMessage());
	    }
	    finally{
	        System.out.println("outer finally");
	    }
	}


	public static void main(String[] args) {
        ExceptionTest obj =new ExceptionTest();
        obj.runMain();
	}

}
