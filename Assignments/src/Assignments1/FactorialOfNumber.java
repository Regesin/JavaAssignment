package Assignments1;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int integer = 0, factorial = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number for Factorial : ");
		integer = sc.nextInt();
		for (int i = 1; i <= integer; i++) {
			factorial = factorial * i;
		}
		System.out.println("The Factorial of the given Number is :  " + factorial);
		sc.close();
	}

}
