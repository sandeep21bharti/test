package com.learn.java8defaultmethod;

interface Moving{
	
	public  default void move() {
		System.out.println("i am moving...");
	}
	
}

interface Walking{
	
	public  default void move() {
		System.out.println("i am walking...");
	}
	
}

public class Java8DefaultMethodInMultipleInheritance  implements Moving, Walking{

	public static void main(String[] args) {
		Java8DefaultMethodInMultipleInheritance obj=new Java8DefaultMethodInMultipleInheritance();
		obj.move();
	}

	//Need to overide the default method because of multiple inheritance.
	@Override
	public void move() {
		Moving.super.move();
		Walking.super.move();
	}

}
