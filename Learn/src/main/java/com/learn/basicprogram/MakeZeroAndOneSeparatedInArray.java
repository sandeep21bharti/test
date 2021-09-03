package com.learn.basicprogram;

public class MakeZeroAndOneSeparatedInArray {

	public static void main(String[] args) {

		int arr[] = { 0, 1, 1, 0, 1, 0, 0, 1, 1, 0 };
		int zeroOccurenceCount = 0;

		// Find the count of all zeros first.
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0)
				zeroOccurenceCount++;
		}

		// ADD zero first in Array
		for (int i = 0; i < zeroOccurenceCount; i++) {
			arr[i] = 0;
		}

		// Add one in remaing array
		for (int i =  zeroOccurenceCount; i < arr.length; i++) {
			arr[i] = 1;
		}

		// print array
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	}

}
