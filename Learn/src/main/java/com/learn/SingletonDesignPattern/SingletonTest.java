package com.learn.SingletonDesignPattern;

public class SingletonTest {

	public static void main(String[] args) {

		Vehicle obj= Vehicle.getInstance();
		Vehicle obj1= Vehicle.getInstance();
		
		 System.out.println(obj==obj1);
	}

}
