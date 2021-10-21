package inheriatanceAssignment;

public class AccountCurrent extends Bank {

	public AccountCurrent(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	void withdraw(double amount) {
		// TODO Auto-generated method stub
		balance = balance - amount - 50;
		//super.withdraw(amount);
	}

	@Override
	void deposit(double amount) {
		// TODO Auto-generated method stub
		balance = balance + amount + 50;
		//super.deposit(amount);
	}
	


}
