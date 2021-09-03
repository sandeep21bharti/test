package com.learn.instanceIntailizerVsStaticBlock;

class A {
	A() {
		System.out.println("parent class constructor invoked");
	}
	
	{
		System.out.println(" Super class instance initializer block is invoked");
	}
	
	static {
		System.out.println(" Super class static block ...");
	}
}

public class B3 extends A {
	B3() {
		super();
		System.out.println("child class constructor invoked");
	}

	B3(int a) {
		super();
		System.out.println("child class constructor invoked " + a);
	}

	{
		System.out.println("Child class instance initializer block is invoked");
	}
	
	static {
		System.out.println(" Child  class static block ...");
	}

	public static void main(String args[]) {
		B3 b1 = new B3();
		B3 b2 = new B3(10);
	}
	/*Points:
		1. static blocks call first if any .
		2. super class constrctor invock second in inheritance if child extends parent.
		3. Then intialized block call in order in which written in code if more than one Intialization block found.
		4.then constructor statemnt executs.
		
		*/
}