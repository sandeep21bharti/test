package com.learn.thiskeyword;

public class This {

	
	 public This() {
		System.out.println("default constructor...");
	}
	 public void show(This t1) {
		// this=t1;//compile time error.
		 System.out.println("the upper commented line"
		 		+ " will not work because this is the current class final variable");
	 }
	public static void main(String[] args) {
		
		This t=new This();
		t.show(t);

	}

}
