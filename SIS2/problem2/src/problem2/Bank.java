package problem2;

import java.util.Vector;

public class Bank {
	Vector<Account> accounts;

	public Bank() {
		accounts = new Vector<Account>();
	}

	public void openAccount(Account a) {
		if (accounts.contains(a)) {
			System.out.println("Account is already exists!");
		} else
			accounts.add(a);
	}

	public void closeAccount(Account a) {
		if (accounts.contains(a)) {
			accounts.remove(a);
			System.out.println("Done");
		} else
			System.out.println("That account is doesn't exists");
	}

	public void update() {
		for (Account a : accounts) {
			if (a.getClass() == SavingsAccount.class) {
				SavingsAccount s = (SavingsAccount) a;
				s.divideFee(0.05);
			} else if (a.getClass() == CheckingAccount.class) {
				CheckingAccount c = (CheckingAccount) a;
				c.addInterestRate();
			}

		}
	}

}
