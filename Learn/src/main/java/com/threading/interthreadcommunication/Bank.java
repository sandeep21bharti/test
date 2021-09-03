package com.threading.interthreadcommunication;

public class Bank {

	private int balance;
	static boolean depositFlag;

	public Bank(int balance) {
		this.balance = balance;
	}

	public void   depositAmount(int amount) {
		balance += amount;
		 System.out.println(  amount+" deposited sucessfully !!. Total balance = "+balance);
	}

	public void  withdrawAmount(int withdrawAmount) {

		if (withdrawAmount > balance) {
			System.out.println( "Insufficent Amount "+withdrawAmount+ " Total balance = "+balance);
		}else {

		balance = balance - withdrawAmount;
		System.out.println(   withdrawAmount+" withdrawl sucessfully !!. Total balance ="+balance);
		}

	}

	public int getBalance() {
		return balance;
	}

	public void  setBalance(int balance) {
		this.balance = balance;
	}

}
