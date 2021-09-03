package com.learn.exception;

public class DeafaultExceptionHandling {

	public static void main(String[] args) {
		dostuff();
		System.out.println("inside the Main ...");

	}

	public static void dostuff() {
		doMorestuff();
		System.out.println("inside the dostuff.....");
	}
	
	public static void doMorestuff() {
		System.out.println("inside the doMorestuff..... Exception ="+10/0);
	}
}
