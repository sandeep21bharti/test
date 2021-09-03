package com.learn.overloadedmethodWithnullParameter;

public class OverlaodedTest {

	public void foo(Object o) {
		System.out.println("Object");
	}

	public void foo(Exception e) {
		System.out.println("Exception");
	}

	public void foo(NullPointerException ne) {
		System.out.println("NullPointerException");
	}

	public static void main(String[] args) {
		new OverlaodedTest().foo(null); /*As above explained, here foo(NullPointerException ne) is the most specific method because it’s inherited from Exception class and
		 hence this code compiles fine and when executed prints “NullPointerException”. */
	}

}
