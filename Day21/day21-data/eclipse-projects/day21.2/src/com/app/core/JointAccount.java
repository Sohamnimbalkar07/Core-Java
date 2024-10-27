package com.app.core;

import static java.lang.Thread.*;

public class JointAccount {
	private double balance;

	public JointAccount(double balance) {
		super();
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "BankAccount [balance=" + balance + "]";
	}

	// update balance : orig bal=5000 , amount =1000
	public synchronized void updateBalance(double amt) throws Exception {
		System.out.println("Updating bal : " + currentThread().getName());//cust1
		balance = balance + amt;//6000
		System.out.println("Cancelling updates, after a dly");
		Thread.sleep(20);//think time : cust1 : Blocked on sleep
		balance = balance - amt;//cancelling updates : 5000 
		System.out.println("Updations over by " + currentThread().getName());
	}//bal =5000

	// chk balance
	public  synchronized  double checkBalance() throws Exception {
		System.out.println("Checking balance : by "+ currentThread().getName());
	//	Thread.sleep(37);
		return balance;

	}//bal=6000

}
