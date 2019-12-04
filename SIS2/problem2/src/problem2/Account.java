package problem2;

public class Account {
	protected double balance;
	private int accNumber;

	public Account(int a) {
		balance = 0.0;
		accNumber = a;
	}

	public void deposit(double in) {
		balance += in;
		getBalance();
	}

	public void withdraw(double out) {
		if (balance < out) {
			System.out.println("Not enough money on your balance");
			getBalance();
		} else
			balance -= out;
		getBalance();
	}

	public double getBalance() {
		return balance;
	}

	public double getAccountNumber() {
		return accNumber;
	}

	public void transfer(double amount, Account other) {
		if (other.accNumber != this.accNumber) {
			withdraw(amount);//CHECK
			other.deposit(amount);
			System.out.println(toString());
			System.out.println(other.toString());
		} else
			System.out.println("Wrong account number! Please, check again.");
	}

	public String toString() {
		return balance + " " + accNumber;
	}

	public final void print() {
		System.out.println(toString());
	}
}
