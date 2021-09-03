package com.learn.lambda;

import java.util.function.Supplier;

public class SupplierInterfaceExample {

	public static void main(String[] args) {
      Supplier<Double>supplier=()-> Math.random();
      System.out.println(supplier.get());
	}

}
