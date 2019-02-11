package com.example.account;

public class Main {
	public static void main(String[] args) {
		SavingAccountService accountService = new SavingAccountService();		
		System.out.println(accountService.name);
		System.out.println(accountService.accountNo);
	}
}
