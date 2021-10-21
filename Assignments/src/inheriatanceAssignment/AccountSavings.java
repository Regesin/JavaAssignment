package inheriatanceAssignment;

public class AccountSavings extends Bank {

	public AccountSavings(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	void withdraw(double amount) {
		// TODO Auto-generated method stub
		balance = balance - amount - 10;
//		super.withdraw(amount);
	}

	@Override
	void deposit(double amount) {
		// TODO Auto-generated method stub
		balance = balance + amount + 2;

//		super.deposit(amount);
	}

}
