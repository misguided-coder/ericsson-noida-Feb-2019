interface AccountService {
	public abstract long open();
	boolean close();
}

class SavingAccountServiceImpl implements AccountService {

	public long open() {
		System.out.println("SavingAccount opened successfully!!!!");
		return 10000L;
	}

	public boolean close() {
		System.out.println("SavingAccount closed successfully!!!!");
		return true;
	}
}

class CurrentAccountServiceImpl implements AccountService {

	public long open() {
		System.out.println("CurrentAccount opened successfully!!!!");
		return 20000L;
	}

	public boolean close() {
		System.out.println("CurrentAccount closed successfully!!!!");
		return true;
	}
}


class FixedDepositAccountServiceImpl implements AccountService {

	public long open() {
		System.out.println("FixedDepositAccount opened successfully!!!!");
		return 20000L;
	}

	public boolean close() {
		System.out.println("FixedDepositAccount closed successfully!!!!");
		return true;
	}
}

class BankManager {

	void openAccount(AccountService accountService) {
		System.out.println("Account application accepted!!!!");
		accountService.open();
	}

	void closeAccount(AccountService accountService) {
		System.out.println("Account closure request accepted!!!!");
		accountService.close();
	}
}

class AccountServiceTest {
	public static void main(String[] args) {
		//UC1();
		//UC2();
		//UC3();
		//UC4();
		UC5();
	}


	static void UC5(){

		BankManager bankManager = new BankManager(); 
		bankManager.openAccount(new SavingAccountServiceImpl());
		bankManager.openAccount(new CurrentAccountServiceImpl());
		bankManager.openAccount(new CurrentAccountServiceImpl());
		bankManager.openAccount(new FixedDepositAccountServiceImpl());
	}

	static void UC4(){

		AccountService accountService = new SavingAccountServiceImpl();
		accountService.open();
		accountService.close();
		accountService = new CurrentAccountServiceImpl();
		accountService.open();
		accountService.close();
	}

	static void UC3(){

		SavingAccountServiceImpl savingAccountService = new SavingAccountServiceImpl();
		savingAccountService.open();
		savingAccountService.close();
		CurrentAccountServiceImpl currentAccountService = new CurrentAccountServiceImpl();
		currentAccountService.open();
		currentAccountService.close();
	}



	static void UC2(){

		//SavingAccountServiceImpl savingAccountService = new SavingAccountServiceImpl();
		AccountService savingAccountService = new SavingAccountServiceImpl();
		//savingAccountService.open();
		long accountNo = savingAccountService.open();
		System.out.printf("ACCOUNT NO : %s%n",accountNo);

		boolean status = savingAccountService.close();
		System.out.printf("ACCOUNT STATUS : %s%n",status ? "INACTIVE" : "ACTIVE");
		//System.out.printf("ACCOUNT STATUS : %s%n",status == true ? "INACTIVE" : "ACTIVE");

		//String label = status == true ? "INACTIVE" : "ACTIVE";
		//System.out.printf("ACCOUNT STATUS : %s%n",label);
	}


	static void UC1(){

		//SavingAccountServiceImpl savingAccountService = new SavingAccountServiceImpl();
		AccountService savingAccountService = new SavingAccountServiceImpl();
		//savingAccountService.open();
		long accountNo = savingAccountService.open();
		System.out.printf("ACCOUNT NO : %s%n",accountNo);

		boolean status = savingAccountService.close();
		//if(status == true) {
		if(status) {
			System.out.println("ACCOUNT STATUS : INACTIVE");
		} else {
			System.out.println("ACCOUNT STATUS : ACTIVE");
		}

	}

}