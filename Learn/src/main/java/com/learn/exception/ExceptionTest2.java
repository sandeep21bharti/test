package com.learn.exception;

public class ExceptionTest2 {
	public static void main(String[] args) {
		String returnVal = method1();
		System.out.println(returnVal);
	}

	public static String method1() {
		try {
			int i = 9;
			System.out.println(i);
			return "from try";// Here this will skip becuase of  finally return statement control will not come here.
		} catch (Exception e) {
			System.out.println("exception caught");
			return "from catch";
		} finally {
			System.out.println("finally block executing");
			return "from finally";//Even though try has return statement finally block gets a chance to execute before try’s return statement and finally has return statement so it returns “from finally” to caller.
		}
	}
}
