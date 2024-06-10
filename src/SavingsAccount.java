
public class SavingsAccount extends  Account  {

	private double intrestRate;
	public  SavingsAccount(int accountNumber,String accountHolderName, double balance,double intrestRate) {
		super(accountNumber,accountHolderName,balance,"Savings");
		this.intrestRate= intrestRate;
		
	}
	public void deposit(double amount) {
		balance +=amount;
	}
	public void withdraw(double amount) {
		if(balance>=amount) {
			balance-=amount;
		}else {
			System.out.println("Insufficient balance for withdrawal");
	}

	}
	public double calculateIntrestrest()
	{
		return balance*(intrestRate/100);
	}
	public String getAccountInfo() {
		return "Savings Account\nAccount Number;"+ accountNumber+ "\nAccount Holder:"+accountHolderName+"\nBalance:"+balance +
			
				"\nIntrest Rate:"+intrestRate+"%";
	}
}

