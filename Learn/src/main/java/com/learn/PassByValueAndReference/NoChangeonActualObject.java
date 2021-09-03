package com.learn.PassByValueAndReference;

public class NoChangeonActualObject {

	//https://www.programmergate.com/java-pass-reference-pass-value/
	public static void main(String[] args) {
		
		Age age =new Age();
		age.setDay(12);
		age.setMonth(3);
		age.setYear(1992);
		System.out.println("Before Modification =" +age);
		
		/*The age object is created inside the heap space and a reference for it is defined inside the stack, 
		 * when calling modification(), a copy of the reference is created inside the stack and passed to the method.
		Any modifications on the object  inside the method is reflected on the copy reference.*/
		modification(age);
		System.out.println("After Modification =" +age);
	}

	private static void modification(Age age) {
		Age age1 =new Age();
		age1.setDay(1222);
		age1.setMonth(333);
		age1.setYear(19492);
		age=age1;
		System.out.println(age);
	}

}
