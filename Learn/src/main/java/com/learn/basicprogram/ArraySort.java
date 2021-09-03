package com.learn.basicprogram;

public class ArraySort {

	public static void main(String[] args) {

		int arr[]= {12,4,67,55,14,12};
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp =arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
				count++;
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println( "Total ="+count);
	}

}
