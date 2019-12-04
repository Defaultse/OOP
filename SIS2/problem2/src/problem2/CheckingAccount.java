package problem2;

public class CheckingAccount extends Account {
	private int cntTransactions;
	private double interestRate;
	final int FREE_TRANSACTIONS = 5;
	private double TRANSACTION_FEE = 0.02;

	public CheckingAccount(int a) {
		super(a);
		cntTransactions = 0;
	}

	public boolean deductFee() {
		return cntTransactions > FREE_TRANSACTIONS;
	}

	@Override
	public void deposit(double in) {
		balance += in;
		getBalance();
	}

	@Override
	public void withdraw(double out) {
		/*
		 * if (balance < out) { System.out.println("Not enough money on your balance");
		 * getBalance(); } else balance -= out; getBalance();
		 */
		 if (cntTransactions>= FREE_TRANSACTIONS) super.withdraw(out + TRANSACTION_FEE);
	        super.withdraw(out);
	        cntTransactions++;

	}

	@Override
	public void transfer(double amount, Account other) {
    if(deductFee()) super.transfer(amount, other);
    else super.transfer(amount+TRANSACTION_FEE, other);
    cntTransactions++;
	}

	public void addInterestRate() {
		this.balance *= (1 + interestRate);		
	}
}
