package com.learn.lambda;

interface Sayable{  
    public String say(String name);  
} 


public class LambdaExpressionExample2 {

	public static void main(String[] args) {
		Sayable ss=(String s)-> {return s;};
		
		System.out.println(ss.say("hello"));

	}

}
