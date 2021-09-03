package com.learn.exception;

public class B  extends RuntimeException{

	public static void main(String[] args)throws B //extends Throwable or  Exception or RuntimeException then this error gone. 
	{  
		
		System.out.println("HII");
	}

}
