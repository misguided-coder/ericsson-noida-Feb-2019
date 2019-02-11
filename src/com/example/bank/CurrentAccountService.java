package com.example.bank;

import com.example.account.AccountService;

public class CurrentAccountService extends AccountService {

	void info() {
		System.out.printf("NAME : %s%n",this.name);
	}
	
}
