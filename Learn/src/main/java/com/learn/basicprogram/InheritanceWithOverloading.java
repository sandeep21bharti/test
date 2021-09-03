package com.learn.basicprogram;

class A{
	
	protected void m1() throws RuntimeException {
		System.out.println("Parnet class method ..");
	}
}

class B extends A
{
	    protected void m1() throws RuntimeException {// if we will remove protected then visibility problem arise.
		System.out.println("Child class method ..");
	}
}

public class InheritanceWithOverloading extends A {
	
	public static void main(String[] args) {

		B b =new B();
		b.m1();
		
	}

}
