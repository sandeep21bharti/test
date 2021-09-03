package com.learn.exception;

import java.io.IOException;

class Hello{

	Hello() throws IOException  // throws can be used with constructor and method level only .
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

public class ThrowsWithConstructor {

	public static void main(String[] args) {
		try {
			Hello h =new Hello(); // every checked exception either use throws or try/catch to handle.
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
	}

}
