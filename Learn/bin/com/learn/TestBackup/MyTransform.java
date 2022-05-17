package com.CSVToXML.demo;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class MyTransform implements Processor {

@Override
public void process(Exchange exchange) throws Exception {

        String myString = exchange.getIn().getBody(String.class);
        String[] lineSeparator = myString.split(System.getProperty("line.separator"));
        StringBuffer sb = new StringBuffer();
        sb.append("<items>");
        sb.append("\n");
        for (String lineData : lineSeparator) 
        {
        String [] commaSeparator=lineData.split("\\|");
        sb.append("<item>");
        sb.append("\n");
        sb.append("<ISBN_10>"+commaSeparator[0].toString()+"</ISBN_10>");
        sb.append("\n");
        sb.append("<ISBN_13>"+commaSeparator[1].toString()+"</ISBN_13>");
        sb.append("\n");
        sb.append("<AUTHOR>"+commaSeparator[2].toString()+"</AUTHOR>");
        sb.append("\n");
        sb.append("<TITLE>"+commaSeparator[3].toString()+"</TITLE>");
        sb.append("\n");
        sb.append("<ATP>"+commaSeparator[4].toString()+"</ATP>");
        sb.append("\n");
        sb.append("<PRICE_NO_VAT>"+commaSeparator[5].toString()+"</PRICE_NO_VAT>");
        sb.append("\n");
        sb.append("<PRICE_VAT>"+commaSeparator[6].toString()+"</PRICE_VAT>");
        sb.append("\n");
        sb.append("<PRICE_NET>"+commaSeparator[7].toString()+"</PRICE_NET>");
        sb.append("\n");
        sb.append("<DISCOUNT>"+commaSeparator[8].toString()+"</DISCOUNT>");
        sb.append("\n");
        sb.append("<CURRENCY>"+commaSeparator[9].toString()+"</CURRENCY>");
        sb.append("\n");
        sb.append("<STATUS>"+commaSeparator[10].toString()+"</STATUS>");
        sb.append("\n");
        sb.append("<AVAIL_DATE>"+commaSeparator[11].toString()+"</AVAIL_DATE>");
              
        sb.append("\n");
        sb.append("</item>");
        sb.append("\n");
        }
        
        sb.append("</Items>");
        System.out.println("MyProcessor complete");
        exchange.getIn().setBody(sb.toString());
    }

}