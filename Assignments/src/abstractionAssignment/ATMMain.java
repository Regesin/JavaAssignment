package abstractionAssignment;

import java.util.Scanner;

public class ATMMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = 0, depositAmount = 0, withdrawAmount = 0;
		int accountType = 0;
		System.out.println("Enter the type of the Account \n 1)Savings Account \t 2)Current Account");
		System.out.println("----------------------------------------------------------------------------------");
		accountType = sc.nextInt();
		Bank bank;

		if (accountType == 1) {
			bank = new AccountSavings(1000);

			while (true) {
				System.out.println("Enter the number to perform operation Savings : ");
				System.out.println("1) Deposit");
				System.out.println("2) Withdraw");
				System.out.println("3) Display Balance");
				System.out.println("4) To Exit the Tranaction");
				System.out
						.println("----------------------------------------------------------------------------------");

				number = sc.nextInt();
				switch (number) {
				case 1:
					System.out.println("Enter the amount to Deposit");
					depositAmount = sc.nextInt();
					bank.deposit(depositAmount);
					break;
				case 2:
					System.out.println("Enter the amount to Withdraw");
					withdrawAmount = sc.nextInt();
					bank.withdraw(withdrawAmount);
					break;
				case 3:
					System.out.println();
					bank.getBalance();
					break;
				default:
					System.exit(10);
				}
			}
		} else if (accountType == 2) {
			while (true) {
				bank = new AccountCurrent(1000);
				System.out.println("Enter the number to perform operation : ");
				System.out.println("1) Deposit");
				System.out.println("2) Withdraw");
				System.out.println("3) Display Balance");
				System.out.println("4) To Exit the Tranaction");
				number = sc.nextInt();
				switch (number) {
				case 1:
					System.out.println("Enter the amount to Deposit");
					depositAmount = sc.nextInt();
					bank.deposit(depositAmount);
					break;
				case 2:
					System.out.println("Enter the amount to Withdraw");
					withdrawAmount = sc.nextInt();
					bank.withdraw(withdrawAmount);
					break;
				case 3:
					System.out.println();
					bank.getBalance();
					break;
				default:
					System.exit(10);
				}
			}

		} else {
			System.out.println("Transaction Cancelled");
		}
		sc.close();
	}

}
