package inheriatanceAssignment;

public class Bank {
	double balance;

	public Bank(double balance) {
		this.balance = balance;
	}
	void withdraw(double amount) {
		balance = balance - amount;
	}
	void deposit(double amount) {
		balance = balance + amount;
	}
	double getBalance() {
		System.out.println("The balance is : "+balance);
		return balance;
	}

}
