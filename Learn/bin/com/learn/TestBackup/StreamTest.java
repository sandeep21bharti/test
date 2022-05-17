package com.CSVToXML.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {

	public static void main(String[] args) {
		String st="a b c d e f g h";
		String[] arr=st.split(" ");
		System.out.println(Arrays.toString(arr));
//		for(String temp: arr) {
//			System.out.println(temp);
//		}
		List<String> ls=Arrays.asList(st.split(" "));
		System.out.println(ls);
		//System.out.println(ls);
//		ls
//		.stream()
//		.filter(st1->st1.equals(new String("a")))
//		.forEach(p->System.out.println(p));
		String out=ls.stream().map(input->{return "'"+input+"'";}).collect(Collectors.joining(","));
		System.out.println(out);

	}

}
