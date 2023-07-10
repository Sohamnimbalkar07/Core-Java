package com.app.core;

import java.time.LocalDate;

public class BankAccount {
	

	private int acctNo;
	private String customerName;
	private String AccountType;
	private int balance;
	

	public BankAccount(int acctNo, String customerName, String accountType, int balance) {
		super();
		this.acctNo = acctNo;
		this.customerName = customerName;
		AccountType = accountType;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "BankAccount [acctNo=" + acctNo + ", customerName=" + customerName + ", AccountType=" + AccountType
				+ ", balance=" + balance + "]";
	}
	
	
	
	public int getAcctNo() {
		return acctNo;
	}

	public void setAcctNo(int acctNo) {
		this.acctNo = acctNo;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getAccountType() {
		return AccountType;
	}

	public void setAccountType(String accountType) {
		AccountType = accountType;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void deposit(double amount)
	{
		balance += amount;
	}
	
	public void withdraw(double amount)
	{
		balance -= amount;
	}
	
	public void transferFunds(BankAccount dest , double amount)
	{
		this.withdraw(amount);
		
		dest.deposit(amount);
	}
	
	public void applyInterest(double interestRate, int periodInYears)
	{
		double simpleInterest = (balance*periodInYears*interestRate)/100;
		deposit(simpleInterest);
	}
}
