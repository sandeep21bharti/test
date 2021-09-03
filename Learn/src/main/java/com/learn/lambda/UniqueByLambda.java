package com.learn.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.print.attribute.SetOfIntegerSyntax;

public class UniqueByLambda {

	public static void main(String[] args) {
    List<String>list=Arrays.asList("yogendra","ajay","sumit","ajay","yogendra");
    
    list=list.stream().distinct().collect(Collectors.toList());
    list.forEach(System.out::println);
    
    
    
    List<Integer>intList=Arrays.asList(12,45,34,67,78,11);
    Optional<Integer> maxSalar=intList.stream().reduce((a,b) ->a >b? a:b);
    System.out.println(maxSalar.get());
	}

}
