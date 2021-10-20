package assignmentsClassesAndObjects;

public class Bank {
	double balance;

	public Bank(double balance) {
		this.balance = balance;
	}

	public void withdraw(int x) {
		if(x>balance) {
			System.out.println("Balance is Low");
		}else {
		balance = balance - x;
		}
	}

	public void deposit(int x) {
		balance = balance + x;
	}

	public double getBalance() {
		System.out.println("The Balance is : ");
		return balance;

	}
}
