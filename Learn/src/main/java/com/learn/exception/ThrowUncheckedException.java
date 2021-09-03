package com.learn.exception;

public class ThrowUncheckedException {

	public static void main(String[] args) {
		m1();
		
	}

	private static void m1() {

		throw new NullPointerException("null pointer exception...");
		
	}

}
