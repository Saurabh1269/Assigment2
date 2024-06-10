
public class Main {
public static void main(String[]args){
	 Bank bank = new Bank();

     SavingsAccount savingsAccount1 = new SavingsAccount(34576883, "Rajat Sharma", 5000.00, 3.5);
     CheckingAccount checkingAccount1 = new CheckingAccount(765542001, "Rohit Patil", 10000.00, 500.00);

     bank.addAccount(savingsAccount1);
     bank.addAccount(checkingAccount1);

     System.out.println("Initial Account Information:");
     bank.displayAccounts();

     savingsAccount1.deposit(6000);
     checkingAccount1.withdraw(3000);

     System.out.println("After Transactions:");
     bank.displayAccounts();

     double interestEarned = savingsAccount1.calculateIntrestrest();
     System.out.println("Interest earned by Savings Account 34576883: " + interestEarned);

     bank.removeAccount(34576883);

     System.out.println("After Removing Savings Account 34576883:");
     bank.displayAccounts();
 
}

}

