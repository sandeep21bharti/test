package com.learn.serialization;

// Java program to demonstrate 
//how to prevent 
//subclass from serialization

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


/*There is no direct way to prevent subclass from serialization in java. One possible way by 
 * which a programmer can achieve this is by implementing the writeObject() and readObject() 
 * methods in the subclass and needs to throw NotSerializableException from these methods.
 *  These methods are executed during serialization and de-serialization respectively. By overriding
 *   these methods, we are just implementing our own custom serialization.
 */

//superclass A1 
//implementing Serializable interface
class A1 implements Serializable
{
 int i;
   
 // parameterized constructor
 public A1(int i) 
 {
     this.i = i;
 }
   
}

//subclass B1
//B1 class doesn't implement Serializable
//interface.
class B1 extends A1
{
 int j;
   
 // parameterized constructor
 public B1(int i,int j) 
 {
     super(i);
     this.j = j;
 }
   
 // By implementing writeObject method, 
 // we can prevent
 // subclass from serialization
 private void writeObject(ObjectOutputStream out) throws IOException
 {
     throw new NotSerializableException();
 }
   
 // By implementing readObject method, 
 // we can prevent
 // subclass from de-serialization
 private void readObject(ObjectInputStream in) throws IOException
 {
     throw new NotSerializableException();
 }
   
}

//Driver class
public class SuperClassSerializedPreventSubclassToBeSerialized
{
 public static void main(String[] args) 
         throws Exception 
 {
     B1 b1 = new B1(10, 20);
       
     System.out.println("i = " + b1.i);
     System.out.println("j = " + b1.j);
       
     // Serializing B1's(subclass) object 
       
     //Saving of object in a file
     FileOutputStream fos = new FileOutputStream("C:\\ADP LCM EM21.1\\abc.ser");
     ObjectOutputStream oos = new ObjectOutputStream(fos);
           
     // Method for serialization of B1's class object
     oos.writeObject(b1);
           
     // closing streams
     oos.close();
     fos.close();
           
     System.out.println("Object has been serialized");
       
     // De-Serializing B1's(subclass) object 
       
     // Reading the object from a file
     FileInputStream fis = new FileInputStream("C:\\ADP LCM EM21.1\\abc.ser");
     ObjectInputStream ois = new ObjectInputStream(fis);
           
     // Method for de-serialization of B1's class object
     B1 b2 = (B1)ois.readObject();
           
     // closing streams
     ois.close();
     fis.close();
           
     System.out.println("Object has been deserialized");
       
     System.out.println("i = " + b2.i);
     System.out.println("j = " + b2.j);
 }
}


