package com.CSVToXML.demo;

public class ReplaceTest {

	public static void main(String[] args) {
String input="java.lang.IllegalArgumentException: The mandatory field defined at the position 8 is empty for the line: 66";

int nextno=4;
int index=input.lastIndexOf(":"); //gives 103 so add 2 to reach at exact 66
System.out.println(index);
int finalvalue=(Integer.parseInt(input.substring(105))+nextno);
System.out.println(input.replace(input.substring(105),String.valueOf(finalvalue)));


	}

}
