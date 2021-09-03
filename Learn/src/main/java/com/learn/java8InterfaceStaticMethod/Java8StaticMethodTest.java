package com.learn.java8InterfaceStaticMethod;

interface test {
	static public void m1() {
		System.out.println("static method of java 8 interface");
	}
}

public class Java8StaticMethodTest {

	public static void main(String[] args) {
		// call to static method of Interface.
		test.m1();

		//Java8StaticMethodTest.m1();  we can't override Interface static method.

	}

	//
	/*
	 * @Override static public void m1() {
	 * System.out.println("static method of java  m1 method of class...."); }
	 */

}
