package com.learn.lambda;

interface Addable{  
    int add(int a,int b);  
}


public class LambdaExpressionExample3 {

	public static void main(String[] args) {
     Addable addition=(a,b)-> { return a+b;};
     System.out.println("Addition="+addition.add(2, 4));
	}

}
