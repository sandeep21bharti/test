package com.learn.exception;

public class ClassNotFoundExceptionTest {

	public static void main(String[] args) {

		try {
			/*ClassNotFoundException is a checked exception which occurs when an application tries
			to load a class through its fully-qualified name and can not find its definition on the classpath. 
			This occurs mainly when trying to load classes using Class. forName(), ClassLoader.*/
			
			Class.forName("yogendra.singh.chandel");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
