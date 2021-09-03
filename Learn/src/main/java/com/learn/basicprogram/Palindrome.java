package com.learn.basicprogram;

public class Palindrome {

	public static void main(String[] args) {
 
		
		System.out.println(checkPalindorme("madam"));
	}

	
	
	static public boolean checkPalindorme(String str){

		for(int i=0,j=str.length()-1;i<=j; i++ ,j--){

		if(!(str.charAt(i)==str.charAt(j))){

		         return false;
		}
		}
		return true;

		}

}
