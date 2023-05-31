import java.util.ArrayList;
import java.util.List;

public class Bank {
	private String name;
	private List<Account> accounts;
	
	public Bank(String name) {
		this.name = name;
		this.accounts = new ArrayList<>(); 
	}
	
	public void addAccount(Account account) {
		accounts.add(account);
	}
	
	public void removeAccount(Account account) {
		accounts.remove(account);
	}
	
	public void displayAllAccounts() {
		for(Account account : accounts) {
			System.out.println("Account number: " + account.getAccountNumber());
			System.out.println("Balance: " + account.getBalance());
			System.out.println("----------");
		}
	}

}
