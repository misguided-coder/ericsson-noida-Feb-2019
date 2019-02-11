package com.example.account;

class CustomerService {
	
	void checkAccount() {
		AccountService accountService = new AccountService();
		System.out.println(accountService.accountNo);
		//System.out.println(accountService.balance);
		accountService.open();
		System.out.println(accountService.name);
			
	}
	
}
