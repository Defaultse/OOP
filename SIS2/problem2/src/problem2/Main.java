package problem2;

public class Main {

	public static void main(String[] args) {
		Account myAccount = new Account(1111);
		myAccount.deposit(100000);
		Account other = new Account(2222);
		other.deposit(50000);
        myAccount.transfer(30000, other);
	}
}
