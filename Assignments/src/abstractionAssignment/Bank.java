package abstractionAssignment;

public abstract class Bank {
	double balance;

	public Bank(double balance) {
		this.balance = balance;
	}
	abstract void withdraw(double amount);
	abstract void deposit(double amount);
	double getBalance() {
		System.out.println("The balance is : "+balance);
		return balance;
	}

}
