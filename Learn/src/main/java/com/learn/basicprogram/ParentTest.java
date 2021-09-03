package com.learn.basicprogram;
class P{
	private void test() {
		System.out.println("In parent..");
	}
	
}

class c extends P{
	private void test() {
		System.out.println("In child..");
	}
	
}
public class ParentTest {
	public static void main(String[] args) {
	  P obj=new c();
    //obj.test();//  test() of P is not visibile.
	}

}
