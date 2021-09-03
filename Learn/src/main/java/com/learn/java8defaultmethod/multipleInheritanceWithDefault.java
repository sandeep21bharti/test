package com.learn.java8defaultmethod;

interface i {

	default void m1() {
		System.out.println("Default method of m1 of interface....i");
	}
}

interface j {

	default void m1() {
		System.out.println("Default method of m1 of interface....j");
	}
}

public class multipleInheritanceWithDefault implements i, j {

	public static void main(String[] args) {
		multipleInheritanceWithDefault obj = new multipleInheritanceWithDefault();
		obj.m1();
	}

	// if we cannot override default method then we got multiple(diamond)inheritance
	// problem.
	@Override
	public void m1() {
		System.out.println("class  method of m1");
	}

}
