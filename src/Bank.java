import java.util.ArrayList;
import java.util.List;
public class Bank {

	private List<Account> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void removeAccount(int accountNumber) {
        accounts.removeIf(account -> account.getAccountNumber() == accountNumber);
    }

    public void displayAccounts() {
        for (Account account : accounts) {
            System.out.println(account.getAccountInfo());
            System.out.println("**********");
        }
    }
}


