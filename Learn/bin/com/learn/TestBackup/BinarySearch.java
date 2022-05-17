package com.CSVToXML.demo;

import java.util.Scanner;

public class BinarySearch{

public static void main(String[] args){

int[] input={3,4,5,7,8,9};

search(input,5);
}

public static void search(int[] inputarray, int searchelement){
int length=inputarray.length;

int i=0;
int j=length-1;
int mid= (i+j)/2;

while(j>i){
if(inputarray[mid]==searchelement){
System.out.println("found the element"+inputarray[mid]);

}

else if(searchelement>inputarray[mid]){
i=mid+1;
}
else if(searchelement<inputarray[mid]){
j=mid-1;
}
else 
{
mid=(i+j)/2;
}
}

}
}