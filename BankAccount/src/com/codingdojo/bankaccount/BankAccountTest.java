package com.codingdojo.bankaccount;

public class BankAccountTest {
	public static void main(String[] arge) {
		BankAccount b= new BankAccount();
		
		System.out.println(BankAccount.getNumberOfAccounts());
		
		b.deposit(50, "checking");
		System.out.println(b.getCheckingBalance());
		b.withdraw(45, "checking");
		System.out.println(b.getCheckingBalance());
		b.withdraw(45, "checking");
		System.out.println(b.getCheckingBalance());
	}
}
