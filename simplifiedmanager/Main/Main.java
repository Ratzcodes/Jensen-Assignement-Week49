package com.week49.simplifiedmanager.Main;

import com.week49.simplifiedmanager.classes.BankAccount;
import com.week49.simplifiedmanager.classes.PersonalAccount;
import com.week49.simplifiedmanager.classes.SavingsAccount;

public class Main {

	public static void main(String[] args) {
		BankAccount baccount = new BankAccount();
		System.out.println(baccount.toString());
		baccount.depositMoney(200.0);
		
		PersonalAccount paccount = new PersonalAccount();
		paccount.depositMoney(70);
		System.out.println(paccount.toString());
		paccount.depositMoney(-1);
		
		SavingsAccount saccount = new SavingsAccount();
		saccount.withdrawMoney(-20);
		saccount.withdrawMoney(20);
		System.out.println(saccount.toString());

	}

}
