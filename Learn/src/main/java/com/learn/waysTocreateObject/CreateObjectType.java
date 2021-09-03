package com.learn.waysTocreateObject;

import java.lang.reflect.Constructor;

class Test implements Cloneable {
	String str = "hello";

	protected Object clone() throws CloneNotSupportedException {
		return  super.clone();
	}
}

public class CreateObjectType {

	public static void main(String[] args) {
		// 1
		Test t = new Test();
		System.out.println(t.str);

		try {
			// 2
			Class<Test> t1 = (Class<Test>) Class.forName("com.learn.waysTocreateObject.Test");
			
			try {
				System.out.println(t1.newInstance().str);
			} catch (InstantiationException | IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {
			// 3
			Constructor<Test> constructorObj = Test.class.getDeclaredConstructor();
			Test obj = constructorObj.newInstance();
			System.out.println(obj.str);
			
			
			//4 
			Test cloneObject= (Test) t.clone();
			System.out.println(cloneObject.str);
			
			
			//5 serialization And then deceralization.

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
