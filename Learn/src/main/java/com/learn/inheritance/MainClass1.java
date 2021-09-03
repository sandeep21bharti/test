package com.learn.inheritance;
class A1
{
    {
        System.out.println(1);
    }
}
 
class B1 extends A1
{
    {
        System.out.println(2);
    }
}
 
class C1 extends B1
{
    {
        System.out.println(3);
    }
}
 
public class MainClass1
{
    public static void main(String[] args)
    {
        C1 c = new C1();
    }
}