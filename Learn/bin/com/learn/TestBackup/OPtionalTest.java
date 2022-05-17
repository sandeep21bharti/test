package com.CSVToXML.demo;

import java.util.Optional;

public class OPtionalTest {

	public static void main(String[] args) {

		String[] words = new String[10];
		/*
		 * Optional.ofNullable- Returns an Optional describing the specified value, if
		 * non-null, otherwise returns an empty Optional. It should be use when no
		 * gurantee of null received
		 */
		String checkWords=words[5];
		System.out.println("printing first"+checkWords);
		//Optional<String> checkNull = Optional.of(words[5]);
		//System.out.println(checkNull);
//		if (checkNull.isPresent()) {// Return true if there is a value present, otherwise false if empty.
//			String word = words[5].toLowerCase();
//			System.out.print(word);
//		} else
//			System.out.println("word is null");

		Integer integer = null;
		// new Integer(7);

		/*
		 * Optional.of(integer) -Returns an Optional with the specified present non-null
		 * value.Otherwise thoows Null pointer Exception.It should use where there is
		 * gurantee of non-null value recive.
		 * 
		 */
//		Optional<Integer> checkInteger = Optional.of(integer);
		//System.out.println("Integer value =" + checkInteger.get());

	}

}