package com.app.banking;
//acctNo(int) , type(enum) , balance , creationDate(LocalDate) , customerName

import java.time.LocalDate;

import custom_exceptions.AccountOverdrawnException;

import static utils.BankValidationRules.validateBalance;

public class BankAccount {
	private int acctNo;
	private AcType type;
	private double balance;
	private LocalDate creationDate;
	private String customerName;

	public BankAccount(int acctNo, AcType type, double balance, LocalDate creationDate, String customerName) {
		super();
		this.acctNo = acctNo;
		this.type = type;
		this.balance = balance;
		this.creationDate = creationDate;
		this.customerName = customerName;
	}

	@Override
	public String toString() {
		return "BankAccount [acctNo=" + acctNo + ", type=" + type + ", balance=" + balance + ", creationDate="
				+ creationDate + ", customerName=" + customerName + "]";
	}

	// B.L deposit
	public void deposit(double amount) {
		balance += amount;
	}

	// B.L withdraw
	public void withdraw(double amount) throws AccountOverdrawnException {
		validateBalance(balance - amount);
		balance -= amount;
	}

	// B.L transfer funds
	public void transferFunds(BankAccount dest, double transferAmount) throws AccountOverdrawnException {
		// wthdraw from src a/c
		this.withdraw(transferAmount);
		dest.deposit(transferAmount);

	}
	//getter for a/c type

	public AcType getType() {
		return type;
	}
	

}
