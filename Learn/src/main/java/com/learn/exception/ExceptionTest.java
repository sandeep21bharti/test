package com.learn.exception;

import java.sql.SQLException;

public class ExceptionTest {

	 public static void main(String[] args) {
	        try {
	            int i=9/0;
	            System.out.println("hello="+i);
	            return;
	        } catch (Exception e) {
	            System.out.println("exception caught");
	            return;
	        }finally {
	        	System.out.println("finally completed");
	        }
	        //Ground rule -> if there is a return statement in try then no code after try- catch will be valid.except finally
	       // System.out.println("task completed");// unreachable code
	 
	    }
}