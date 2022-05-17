package com.CSVToXML.demo;

import java.util.HashMap;

public class BracesCount {

	public static void main(String[] args) {
		String[] bracks = { ")())", ")", "((","((", "(", ")", ")" };
		int length= bracks.length;
		HashMap<Integer, Integer> open = new HashMap<>();
	    HashMap<Integer, Integer> close = new HashMap<>();
		int op=0, cl=0;
		
		for(int i=0;i<length;i++) {
			
			String l=bracks[i];
			for(int j=0;j<l.length();j++) {
				if(l.charAt(j)=='(') {
					op++;
				}
				else if(op!=0) {
					op--;
				}
				else {
					cl++;
				}
			}
		}
		
		if (op != 0 && cl == 0)
            open.put(op, open.get(op) == null ?
                     1 : open.get(op) + 1);
 
        // If requirements of closing
        // are there and no opening
        if (cl != 0 && op == 0)
            close.put(cl, close.get(cl) == null ?
                      1 : close.get(cl) + 1);
 
System.out.println("open braces"+op +"close braces"+cl);
	}

}
