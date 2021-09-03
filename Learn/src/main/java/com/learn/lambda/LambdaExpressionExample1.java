package com.learn.lambda;


@FunctionalInterface  //It is optional  
interface Drawable{  
    public void draw();  
}  

public class LambdaExpressionExample1 {

	public static void main(String[] args) {
		Drawable d= ()->System.out.println("this is draw method..");
		d.draw();

	}

}
