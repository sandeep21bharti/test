package com.CSVToXML.demo;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConvertApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(ConvertApplication.class, args);
		
		/*
		 * CamelContext _ctx=new DefaultCamelContext(); _ctx.addRoutes(new
		 * RouteBuilder(){ public void configure() throws Exception {
		 * from("file:C:\\Development_Avecto\\ApacheCamel\\Demo1\\IN") .log("${body}")
		 * .process(new MyTransform()) .to(
		 * "file:C:\\Development_Avecto\\ApacheCamel\\Demo1\\OUT?fileName=OutPut1.xml");
		 * } }); _ctx.start(); Thread.sleep(4000); _ctx.stop();
		 */
	}

}
