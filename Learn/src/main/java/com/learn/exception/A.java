package com.learn.exception;

import java.io.IOException;

public class A {

	public static void main(String[] args) {

		m1();

	}

	private static void m1() {
		//throw new Exception("IO exception"); 
		//In Java exceptions under Error and RuntimeException classes are unchecked exceptions, 
		//everything else under throwable is checked
		//Note: Exception class is also comes under the checked exception.
	}

}
