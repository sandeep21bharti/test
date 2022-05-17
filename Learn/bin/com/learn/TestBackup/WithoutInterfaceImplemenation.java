package com.CSVToXML.demo;

import java.util.Arrays;

interface Aa{
public static int fun() {
System.out.println("Utility purpose");
return 12;

}
public  static void test1() {
	System.out.println("Inside main method of interface");
}
public void test();
}
public class WithoutInterfaceImplemenation {



public static void main(String[] args) {
System.out.println(Aa.fun());
Aa.test1();
}



}