package com.CSVToXML.demo;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
 int[] input= {3,9,6,1,2,5,7};
 int largest=input[0];
 int secondlargest=input[0];
 for(int i=0; i<input.length;i++) {
	 if(input[i]>largest) {
		 secondlargest=largest;
		 largest=input[i];
	 }
		 else if(input[i]<largest && input[i]>secondlargest) {
			 secondlargest=input[i];
		 }
		 
	 }
 System.out.println(secondlargest);
System.out.println(Arrays.toString(input));
	}

}
