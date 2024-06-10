
abstract class Account {
	protected int accountNumber;
	protected String
accountHolderName;
	protected double balance;
	protected String accountType;

	public Account(int accountNumber,String accountHolderName, double balance,String accountType ) {
		
		this.accountNumber = accountNumber;
		this.accountHolderName =accountHolderName;
		this.balance =balance;
		this.accountType =accountType;
		
	}
	
	public abstract void  deposit(double amount);
	public abstract void  withdraw(double amount);
	public abstract String getAccountInfo();

	public int getAccountNumber() {
		return accountNumber;
	}



	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getAccountType() {
		return accountType;
	}
	
	 
		
	}
	
	
	


