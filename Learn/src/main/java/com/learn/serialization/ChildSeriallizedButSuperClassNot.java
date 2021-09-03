package com.learn.serialization;

/*What happens when a class is serializable but its superclass is not ?*/

/*Serialization:
	At the time of serialization, if any instance variable is inheriting 
from non-serializable superclass, then JVM ignores original value of that instance variable and 
save default value to the file.*/

/*De- Serialization:
	At the time of de-serialization, if any non-serializable superclass is present, then JVM will
	execute instance control flow in the superclass. To execute instance control flow in a class, 
	JVM will always invoke default(no-arg) constructor of that class. So every non-serializable 
	superclass must necessarily contain default constructor, otherwise we will get runtime-exception.*/

//Java program to demonstrate 
//the case if superclass need
//not to be serializable 
//while serializing subclass 

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;;

//superclass Parent 
//Parent class doesn't implement Serializable
//interface.
class Parent 
{
 int i;
   
 // parameterized constructor
 public Parent(int i) 
 {
     this.i = i;
 }
   
 // default constructor
 // this constructor must be present during decserializtion
 // otherwise we will get runtime exception
 public Parent()
 {
    // i = 50;
     System.out.println("Parent's class constructor called ");
 }
   
}

//subclass child
//implementing Serializable interface
class Child extends Parent implements Serializable
{
 int j;
   
 // parameterized constructor
 public Child(int i,int j) 
 {
     super(i);
     this.j = j;
 }
}

//Driver class
public class ChildSeriallizedButSuperClassNot
{
 public static void main(String[] args) 
         throws Exception 
 {
	 Child b1 = new Child(10,20);
       
     System.out.println("i = " + b1.i);
     System.out.println("j = " + b1.j);
       
     // Serializing Child's(subclass) object 
       
     //Saving of object in a file
     FileOutputStream fos = new FileOutputStream("C:\\\\ADP LCM EM21.1\\\\abc.ser");
     ObjectOutputStream oos = new ObjectOutputStream(fos);
           
     // Method for serialization of Child's class object
     oos.writeObject(b1);
           
     // closing streams
     oos.close();
     fos.close();
           
     System.out.println("Object has been serialized");
       
     // De-Serializing Child's(subclass) object 
       
     // Reading the object from a file
     FileInputStream fis = new FileInputStream("C:\\\\ADP LCM EM21.1\\\\abc.ser");
     ObjectInputStream ois = new ObjectInputStream(fis);
           
     // Method for de-serialization of Child's class object
     Child b2 = (Child)ois.readObject();
           
     // closing streams
     ois.close();
     fis.close();
           
     System.out.println("Object has been deserialized");
       
     System.out.println("i = " + b2.i);
     System.out.println("j = " + b2.j);
 }
}


