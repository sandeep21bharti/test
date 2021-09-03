package com.learn.lambda;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaExpressionForEachLoop {

	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList<>();
		list.add("Anuj");
		list.add("sunil");
		list.add("summit");
		
		System.out.println("Functional interface with annonymous class");
		list.forEach(new Consumer<String >() {

			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		});
		
		//forEach with lambda expression.
		System.out.println("Functional interface with lambda expression");
		list.forEach((name)->System.out.println(name));
		
		// method refrences
		System.out.println("Functional interfaces with method reference");
		list.forEach(System.out::println);
		
	}

}
