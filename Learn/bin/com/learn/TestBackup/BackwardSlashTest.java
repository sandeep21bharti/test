package com.CSVToXML.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BackwardSlashTest {

	public static void main(String[] args) {

		String initial="\"130141\", \"I\", \"14511395\", \"+\", 148.05| \"USD \", 148.05| \"             \", \"ZMST00\", \"                                                  \", \"                              \", \"AMB\", \"000007487467\", \"000000553461\", \"        \", \"ARP00000270\", \"  \"";
	
		List<String> list=new ArrayList<>();
		list.add(initial);
		System.out.println(list);
		List<String> newList=list.stream()
				.map(input->input.replace(",", "|"))
				.map(input->input.replace("\"", ""))
				.map(input->input.replace("&","&amp;"))
				.collect(Collectors.toList());
		System.out.println(newList);
	
	}

}
