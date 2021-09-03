package com.learn.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;


class FunctionalExpressionUtility{
	
	public  Function<Integer,Integer> squareOfNumber=(e)-> e*e;
	
	public static Function<String,Integer> convertStringToLength=(e)->e.length();
	
}
public class FunctionExample {

	public static void main(String[] args) {

		List<Integer>integerList=Arrays.asList(12,14,15,17,18);
		
		System.out.println("Square of number");
		List<Integer>listofSquare=getSquareofNumber(integerList,new FunctionalExpressionUtility().squareOfNumber);
		listofSquare.forEach(System.out::println);
		
		List<String>listString=Arrays.asList("Anil","Summit","Yogendra","ankit");
		System.out.println("Length  of Strings");
		List<Integer>listofStringLength=getLengthofStrings(listString,FunctionalExpressionUtility.convertStringToLength);
		listofStringLength.forEach(System.out::println);
		
	}
	
	static List<Integer> getSquareofNumber(List<Integer>integerList,Function<Integer,Integer>function){
	   List<Integer>squareList=new ArrayList<>();
	   for (Integer integer : integerList) {
		    Integer output=function.apply(integer);
		    squareList.add(output);
	}
	   return squareList;
		
	}
	
	

	static List<Integer> getLengthofStrings(List<String>stringList,Function<String,Integer>function){
	   List<Integer>lenthList=new ArrayList<>();
	   for (String string : stringList) {
		    Integer length=function.apply(string);
		    lenthList.add(length);
	}
	   return lenthList;
		
	}

}
