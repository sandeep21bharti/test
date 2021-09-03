package com.learn.basicprogram;

public class BInarySearch {

	public static void main(String[] args) {

		int arr[]= {12,14,17,19,28,45,67};
		int searchElement=61;
		int min=0;
		int max=arr.length-1;
		while(min<=max) {
			
		int mid= (min+max)/2;
		
		if(arr[mid]==searchElement) {
			  System.out.println(searchElement +" present at index= "+mid);
			  break;
		}else if (arr[mid]>searchElement) {
			  max=mid-1;
		}else {
			min=mid+1;
		}
		}
		
		if(min>max) {
			System.out.println("Not availabe in given search array.");
		}
	}

}
