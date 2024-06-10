
public class CheckingAccount extends Account  {
	 private double overdraftLimit;

	    public CheckingAccount(int accountNumber, String accountHolderName, double balance, double overdraftLimit) {
	        super(accountNumber, accountHolderName, balance, "Checking");
	        this.overdraftLimit = overdraftLimit;
	    }

	    
	    public void deposit(double amount) {
	        balance += amount;
	    }

	   
	    public void withdraw(double amount) {
	        if (balance + overdraftLimit >= amount) {
	            balance -= amount;
	        } else {
	            System.out.println("Withdrawal cannot be processed due to insufficient funds.");
	        }
	    }

	    public boolean checkOverdraft() {
	        return balance < 0;
	    }

	    @Override
	    public String getAccountInfo() {
	        return "Checking Account\nAccount Number: " + accountNumber + "\nAccount Holder: " + accountHolderName +
	                "\nBalance: " + balance + "\nOverdraft Limit: " + overdraftLimit;
	    }
	}
	


