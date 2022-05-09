package com.learn.lambda;

import java.util.function.Predicate;

interface MyInterface{
	
	public static String  myfun() {
		return "Static method for utility purpose.";
	}
}

public class StaticMethodInPredicateFunctionalInterface {

	
	public static void main(String[] args) {
		
		//here we are using the static method(isEqual) of FunctionalInterface(Predicate)
		//directly.there is no need to give implemenation class if u want to acces the static method of FunctionalInterface.
		
		//Example -1
		Predicate<String>predicate= Predicate.isEqual("Yogendra");
		System.out.println(predicate.test("Yogendra"));
		
		
		//Example-2 (no need to implement Interface ,just directly call the static method by Interface name
		System.out.println(MyInterface.myfun());
		
		

	}

}
