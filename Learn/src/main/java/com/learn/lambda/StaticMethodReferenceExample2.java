package com.learn.lambda;

@FunctionalInterface
interface myInterface{
	   void greet();
}



public class StaticMethodReferenceExample2 {
	public static void greetings() {
		System.out.println("Nice to talk you! ");
	}

	public static void main(String[] args) {
     
		myInterface my=StaticMethodReferenceExample2::greetings;
		my.greet();
		
	}

}
