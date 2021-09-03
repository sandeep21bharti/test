package com.learn.collectionframework;

import java.util.Stack;

public class BalancedBracesProblem {

	public static void main(String[] args) {

		String str="{[()]}";
		System.out.println(isBalanced(str)? "BALANCED": "NOT BALANCED");
		
		
	}
	
	
	static boolean isBalanced(String s){
		//checking the size of string should be even after divide.
		if(!(s.length()%2==0)) {
			return false;
		}
		
		Stack<Character> st = new Stack<>();
		 
	    for(int i = 0; i < s.length(); i++) {
	 
	        Character ch = s.charAt(i);
	 
	        if(!st.isEmpty() && ch == '}' && st.peek() == '{') {
	              st.pop();
	 
	        } else if(!st.isEmpty() && ch == ')' && st.peek() == '(') {
	             st.pop();
	 
	        } else if(!st.isEmpty() && ch == ']' && st.peek() == '[') {
	                st.pop();
	 
	        } else {
	              st.push(ch);
	        }
	 
	    }
	 
	    if(st.isEmpty()) {
	       return true;
	    } 
	 
	     return false;  
	}
	
	

}
