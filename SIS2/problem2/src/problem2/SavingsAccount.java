package problem2;

public class SavingsAccount extends Account{
	private double interestRate;
	private double TRANSACTION_FEE = 0.02;
	
	public SavingsAccount(int a) {
		super(a);
	}
	
	public void addInterest() {
		super.balance+=interestRate;
		System.out.println(super.toString());
	}

	@Override
	public void deposit(double in) {
		super.balance+=in;
		getBalance();
	}


    @Override
    public void withdraw(double out) {
		if(super.getBalance()<out) {
		System.out.println("Not enough money on your balance");
		super.getBalance();
		}
		else super.withdraw(out-=TRANSACTION_FEE);
		super.getBalance();
	}

    @Override
    public void transfer(double amount, Account other) {
		if(other.getAccountNumber()!=super.getAccountNumber()) {
			withdraw(amount);
			other.deposit(amount);
			System.out.println(toString());
			System.out.println(other.toString());
		}
		else System.out.println("Wrong account number! Please, check again.");
	}

	public void divideFee(double amount) {
		this.TRANSACTION_FEE = TRANSACTION_FEE + amount;
	}
}
