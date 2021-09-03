package com.learn.overloadedmethodWithnullParameter;

class Overloaded
{
	public void m1(Object o) {
		System.out.println("Callin object parameter..");
	}
	
	public void m1(String s) {
		System.out.println("Callin String  parameter..");
	}
	
	/*
	 * public void m1(Integer i) {
	 * System.out.println("Callin Integer  parameter.."); }
	 */
}

public class OverloadedNullAsParameter {

	public static void main(String[] args) {
      new  Overloaded().m1(null); // will call the more specific that is string one..
      
      /* but when Interger parameter method will uncomment then Jvm can't decide because of  String and Integer class have Object as parent class and there is no inheritance. So java compiler doesn’t consider 
       * any of them to be more specific, hence the method ambiguous call error 
       */
	}

}
