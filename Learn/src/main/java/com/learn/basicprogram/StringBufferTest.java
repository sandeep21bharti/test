package com.learn.basicprogram;

public class StringBufferTest {

	public static void main(String[] args) {
		String s="what";
		StringBuffer sb=new StringBuffer("what");
		System.out.println(s.equals(sb)+"  "+sb.equals(s));
		System.out.println(s.contentEquals(sb));
	}

}
