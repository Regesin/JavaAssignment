package abstractionAssignment;

public class AccountCurrent extends Bank {
	double amount = 0;

	public AccountCurrent(double balance) {
		super(balance);
	}

	@Override
	void withdraw(double amount) {
		// TODO Auto-generated method stub
		balance = balance - amount - 50;

	}

	@Override
	void deposit(double amount) {
		// TODO Auto-generated method stub
		balance = balance + amount + 50;

	}

}
