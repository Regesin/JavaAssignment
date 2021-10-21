package abstractionAssignment;

public class AccountSavings extends Bank {
	double amount = 0;

	public AccountSavings(double balance) {
		super(balance);
	}

	@Override
	void withdraw(double amount) {
		// TODO Auto-generated method stub
		balance = balance - amount - 10;

	}

	@Override
	void deposit(double amount) {
		// TODO Auto-generated method stub
		balance = balance + amount + 2;


	}
}
