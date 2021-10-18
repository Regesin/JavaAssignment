package Assignments1;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int integer = 0, originalInteger = 0, result = 0, temp = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find Armstrong Number :");
		integer = sc.nextInt();
		originalInteger = integer;
		while (integer != 0) {
			temp = integer % 10;
			result = result + (temp * temp * temp);
			integer = integer / 10;
		}
		if (result == originalInteger) {
			System.out.println("Number is Armstrong Number");
		} else {
			System.out.println("Number is Not Armstrong Number");
		}
		sc.close();
	}

}
