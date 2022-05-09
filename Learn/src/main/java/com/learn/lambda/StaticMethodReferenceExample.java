package com.learn.lambda;

import java.util.ArrayList;
import java.util.List;


class ClassA {
    public static void raiseToThePowerOfTwo(double num) {
        double result = Math.pow(num, 2);
        System.out.println("square of "+num +" ="+result);
    }
}

public class StaticMethodReferenceExample {

	public static void main(String[] args) {
		List<Double> integerList = new ArrayList<>();
        integerList.add(new Double(5));
        integerList.add(new Double(2));
        integerList.add(new Double(6));
        integerList.add(new Double(1));
        integerList.add(new Double(8));
        integerList.add(new Double(9));
        
        integerList.forEach(ClassA::raiseToThePowerOfTwo);
        
        
	}

}
