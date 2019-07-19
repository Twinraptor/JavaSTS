package com.codingdojo.bankaccount;
import java.util.Random;

public class BankAccount {
	private String accountNumber;
	private double checking;
	private double saving;
	public static double totalBalance;
	private static int TotalAccounts;
	
	public BankAccount() {
		this.accountNumber= this.getRandomAcc();
		this.checking = 0;
		this.saving = 0;
		TotalAccounts++;
	}
	
	public static int getNumberOfAccounts() {
		return TotalAccounts;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public double getCheckingBalance() {
		return checking;
	}
	private void setCheckingBalance(double checkingBalance) {
		this.checking = checkingBalance;
	}
	public double getSaving() {
		return saving;
	}
	private void setSaving(double savingsBalance) {
		this.saving = savingsBalance;
	}
	
	private String getRandomAcc() {
		String acc="";
		Random r= new Random();
		for(int i=0; i<10;i++) {
			acc += String.valueOf(r.nextInt(10));
		}
		return acc;
	}
	
	public void deposit(double amount, String accountType) {
		if(accountType.equals("checking")) {
			this.checking+=amount;
		}else {
			this.saving+=amount;
		}
	}
	public void withdraw(double amount, String accountType) {
		if(accountType.equals("checking")) {
			if(amount <= this.getCheckingBalance()) {
				this.checking-=amount;
			} else {
				return;
			}
		}else {
			if(amount <= this.getSaving()) {
			this.saving-=amount;
			} else {
				return;
			}
		}
	}
}
	