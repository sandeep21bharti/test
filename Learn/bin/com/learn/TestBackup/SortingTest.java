package com.CSVToXML.demo;

import java.util.Arrays;

public class SortingTest {

	public static void main(String[] args) {
int[] input= {5,3,7,5,1,6,9,8};

    for(int i=0;i<input.length;i++) {
    	int min=i;
    	for(int j=i+1;j<input.length;j++) {
    		
    		if(input[min]>input[j]) {
    			min=j;
    		}}
    		int temp=input[i];
    		input[i]=input[min];
    		input[min]=temp;
    	
    }
    for(int k=0;k<input.length;k++) {
    	System.out.println(input[k]);
    }

	

}
}