package com.CSVToXML.demo;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;
@Component
public class MainCamelCoverter extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		from("file:C:\\Development_Avecto\\ApacheCamel\\Demo1\\IN")
		.log("${body}")
		.process(new MyTransform())
		.to("file:C:\\Development_Avecto\\ApacheCamel\\Demo1\\OUT?fileName=OutPut1.xml");
		
	}

	
}
