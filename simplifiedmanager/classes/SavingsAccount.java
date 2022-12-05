package com.week49.simplifiedmanager.classes;

import java.util.UUID;

public class SavingsAccount extends BankAccount{

	public SavingsAccount() {
		this.setAccountNumber(UUID.randomUUID().toString().substring(0,6));
		this.setBalance(0.0);
		this.setAccountType("Savings Account");
		
	}
	
	
}
