package com.learn.exception;

import java.io.IOException;

public class ExceptionCode {

	public static void start() {
		System.out.println("Java Exception interivew question Answers for Programmers");
	}

	public static void main(String args[]) {
		   try{
		      start();
		      //If we replace the Exception with any checked exception then complier report an error 
		      //message - Unreachable catch block for <CheckedExceptionName>. This exception is never thrown from the try statement body.
		      // because checked exception check at compile time.
		   }catch(Exception ioe){
		      ioe.printStackTrace();
		   }


		//Read more: https://javarevisited.blogspot.com/2013/06/10-java-exception-and-error-interview-questions-answers-programming.html#ixzz6w9fHYW3b

}
}