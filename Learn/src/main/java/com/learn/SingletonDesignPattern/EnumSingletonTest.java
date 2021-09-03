package com.learn.SingletonDesignPattern;

public class EnumSingletonTest {

	public static void main(String[] args) {
		EnumSingleton enumSingleton1 = EnumSingleton.MY_INSTANCE.getInstance();

		System.out.println(enumSingleton1.getInfo()); // Initial enum info

		EnumSingleton enumSingleton2 = EnumSingleton.MY_INSTANCE.getInstance();
		enumSingleton2.setInfo("New enum info");

		System.out.println(enumSingleton1.getInfo()); // New enum info
		System.out.println(enumSingleton2.getInfo()); // New enum info
		
		System.out.println("enumSingleton1 hashcode="+enumSingleton1.hashCode());
		System.out.println("enumSingleton2 hashcode="+enumSingleton2.hashCode());
	}

}
