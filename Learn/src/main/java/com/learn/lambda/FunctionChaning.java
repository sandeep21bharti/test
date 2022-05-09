package com.learn.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionChaning {

	public static void main(String[] args) {
		
		Function<String,String>upperCaseFun=string-> string.toUpperCase();
		Function<String,String>substringFun=string->string.substring(0, 5);
		
		
		//Function chaining with andThen(-),- first upperCaseFun perform after that andThen(-) operation call.
		Function<String,String>functionChain=upperCaseFun.andThen(substringFun);
		System.out.println(functionChain.apply("yogendra"));
		
		
		
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		Function<Integer, Double>changetoDouble=num->num*1.00;
		Function<Double,Double>square=num->num*2;
		
		
		//first changeToDouble and then square operation performed .Just reverse of andThen().
		Function<Integer, Double>firstChangeToDoubleThenSquare=square.compose(changetoDouble);
		
		//map takes argument as Function<T,R> 
		System.out.println(list.stream().map(firstChangeToDoubleThenSquare).collect(Collectors.toList()));
		
		
		

	}

}
