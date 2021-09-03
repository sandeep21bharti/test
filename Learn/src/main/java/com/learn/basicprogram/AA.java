package com.learn.basicprogram;

import java.text.DecimalFormat;

public class AA {

	public static void main(String[] args) {
		
		String str="9999";
		double d=Double.parseDouble(str);  
		
		System.out.println(d); 
		//System.out.println(d/1000); 
		DecimalFormat four = new DecimalFormat("#.00000");
		
		System.out.print(four.format(d));
		
		
	}

}
