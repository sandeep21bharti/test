package com.CSVToXML.demo;

import java.util.Stack;

public class ObjectCreateWithManyWays {
	
	public static void main(String[]args) throws ClassNotFoundException   {
		
		
		String braces="[{()}]";
		Stack<Character> st=new Stack<>();
		
		int i=0;
		while(braces.length()>i) {
			char ch=braces.charAt(i);
			
			if(!st.isEmpty() &&ch==']' && st.peek()=='[') {
				st.pop();
			}
			else if(!st.isEmpty() && ch=='}' &&st.peek()=='{') {
				st.pop();
			}
			else if(!st.isEmpty() &&ch==')' && st.peek()=='(') {
				st.pop();
			}
			else {
				st.push(ch);
			}
			i++;
			
		}
		
		if(st.isEmpty()) {
			System.out.println("this is balanced");
		}
		else {
			System.out.println("not balanced");
		}

	}

}
