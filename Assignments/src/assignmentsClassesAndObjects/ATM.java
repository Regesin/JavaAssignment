package assignmentsClassesAndObjects;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 0, depositAmount = 0, withdrawAmount = 0;
		Bank ban = new Bank(1000);
		Scanner sc = new Scanner(System.in);

		while (true) {
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
				ban.deposit(depositAmount);
				break;
			case 2:
				System.out.println("Enter the amount to Withdraw");
				withdrawAmount = sc.nextInt();
				ban.withdraw(withdrawAmount);
				break;
			case 3:
				System.out.println(ban.getBalance());
				break;
			default:
				System.exit(10);
			}
		}

	}

}
