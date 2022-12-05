package com.week49.simplifiedmanager.classes;

import java.util.UUID;

import com.week49.simplifiedmanager.interfaces.BankOperations;

public class BankAccount implements BankOperations{

	//attributes of the class
	private String accountNumber;
	private String accountType;
	private double balance;
	
	//constructor with the following body
	public BankAccount(){
		this.accountNumber = UUID.randomUUID().toString().substring(0,6);
		this.balance = 0;
		this.accountType = "Bank Account";
	}
	
	//getters and setters for the attributes
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public String getAccountNumber() {
		return this.accountNumber;
	}
	
	
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getAccountType() {
		return this.accountType;
	}
	
	
	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return this.balance;
	}

	
	@Override
	public void withdrawMoney(double amount) {
		if(amount >= 0) {
			setBalance(getBalance()-amount);
		}else {
			System.out.println("You cannot withdraw a negative value.");
		}
	}
	
	
	@Override
	public void depositMoney(double amount) {
		if(amount >= 0) {
			setBalance(getBalance()+amount);
		}else {
			System.out.println("You cannot deposit a negative value.");
		}
		
	}
	
	
	public String toString() {
		return "accountNumber = " +this.accountNumber + ",balance = "+ this.balance + ",accountType = " +this.accountType;
	}
	
	
	
}
