package com.learn.basicprogram;

abstract class Myclass{
	private int a,b;
	public void call(int a,int b) {
		this.a=a;
		this.b=b;
		System.out.println(a +"  "+b);
	}
}
public class AbstractTest {

	public static void main(String[] args) {
		//Myclass m=new Myclass() ;
		//m.call(2, 3);
		
	}

}
