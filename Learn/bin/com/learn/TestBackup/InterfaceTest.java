package com.CSVToXML.demo;

interface Test{
	 static void test() {
		 System.out.println("Inside static method of interface");
	 }
	 default void defTest() {
		 System.out.println("in Interface  method");
	 }
	
}

public class InterfaceTest implements Test {
	
	public void test1() {
		Test.test();
	}
	public void defTest2() {
		System.out.println("in child class method");
	}

	public static void main(String[] args) {

		
Test t=new InterfaceTest();
t.defTest();

	}

}
