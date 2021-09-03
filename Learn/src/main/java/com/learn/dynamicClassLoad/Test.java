package com.learn.dynamicClassLoad;

public class Test {

	public static void main(String[] args) {
		
		try {
			Object obj=Class.forName("com.learn.dynamicClassLoad.Student").newInstance();
			System.out.println(obj);
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
