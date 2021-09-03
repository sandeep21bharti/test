package com.learn.java8defaultmethod;

interface Move{
	public default void move() {
		System.out.println("I am moving...");
	}
}



public class Java8DefaultMethodOverirde  implements Move{
	
	@Override
	public  void move() {
		System.out.println("I am moving in Subclass...");
	}

	public static void main(String[] args) {
		Java8DefaultMethodOverirde obj=new Java8DefaultMethodOverirde();
		obj.move();
	}

}
