
public class Main {
	public static void main(String[] args) {
		Bank bank = new Bank("Bank");
		
		Account account1 = new Account("1", 1000.00);
		Account account2 = new Account("2", 2000.00);
		
		bank.addAccount(account1);
		bank.addAccount(account2);
		
		bank.displayAllAccounts();
		
		account1.deposit(1000.00);
		account2.withdraw(500.00);
		
		bank.displayAllAccounts();
	}

}
