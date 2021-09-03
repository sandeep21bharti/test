package com.learn.inheritance;

class Parent{
	
	public Parent(){
		System.out.println("Parent is called...");
	}
	
}

class Child extends Parent{
	public Child(){
		
		System.out.println("Child is called...");
	}
}


public class ParentChild {

	public static void main(String[] args) {
		
		Child c=new Child();
		
	}

}
