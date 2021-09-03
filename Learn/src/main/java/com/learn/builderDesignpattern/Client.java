package com.learn.builderDesignpattern;

import com.learn.builderDesignpattern.Student.StudentBuilder;

public class Client {

	//https://www.adevguide.com/builder-design-pattern-java/
	
/*	Advantages of Builder Pattern Design to create complex object :
 
	1. It provides a clear separation between the construction and representation of an object.
	2. immutability is forced to the object once it is created.
	3.Object Creation code less error-prone as a user will know what they are passing because of the explicit method call.
	4.The builder pattern increases robustness, as the only fully constructed object will be available to the client. 
	
	There are three major issues with Factory and Abstract Factory design patterns when the Object contains a lot of attributes.

	Too Many arguments to pass from client program to the Factory class that can be error prone because most of the time, the type of arguments are same and from client side its hard to maintain the order of the argument.
	Some of the parameters might be optional but in Factory pattern, we are forced to send all the parameters and optional parameters need to send as NULL.
	If the object is heavy and its creation is complex, then all that complexity will be part of Factory classes that is confusing.
		
	*/
	public static void main(String[] args) {
      
		Student student=new Student.StudentBuilder("yogendra", "singh")
				.addAge("30")// optional
				.addCity("Dehradun")// optional
				.build();// to get back student option
		
		System.out.println(student);
		
		
		Student student1=new Student.StudentBuilder("rahul", "kumar")
				.addCity("delhi")// optional
				.build();// to get back student option
		
		System.out.println(student1);
		
		
	}

}
