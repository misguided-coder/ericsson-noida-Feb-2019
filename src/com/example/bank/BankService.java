package com.example.bank;

import com.example.account.AccountService;

class BankService {
	
	void openAccount() {
		AccountService accountService = new AccountService();
		accountService.accountNo = 10000;
		accountService.open();
		//System.out.println(accountService.balance);
		//System.out.println(accountService.name);
	}
	
}
