package com.learn.lambda;

@FunctionalInterface
interface myInterfaces{
	void greet();//abstract method.
}


/*
 * Method refrence- To refer the another method by using :: 
 * below is the some conditions should be match to use method Reference:
 *  1) The both the methods of refering and referrer should have same argumnets and same dataType. 
 *  2)No need of same method. 
 *  3) no need of same return type.
 *  4) No need of same modifiers. 
 *  5) It can be static or non-static also.
 *  	 Benefit- The code reusablitity
 */
public class StaticMethodReferenceExample2 {
	
	public static String greetings() {
		System.out.println("I am refrenced . ");
		return "Happy";
		
	}

	public static void main(String[] args) {
		
		myInterfaces my=StaticMethodReferenceExample2::greetings;
	    my.greet();//when the greet method call the greeting method refrence is taken place.
		
	}

}
