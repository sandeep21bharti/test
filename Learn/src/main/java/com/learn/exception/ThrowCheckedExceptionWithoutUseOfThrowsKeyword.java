package com.learn.exception;

import java.io.IOException;

public class ThrowCheckedExceptionWithoutUseOfThrowsKeyword {

	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		System.out.println("Inside the m1..But Checked Exception exception will not throw..without uses throws keyword at method level");
		//uncomment this line.
		//throw new IOException("IO exception");
	}

}
