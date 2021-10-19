package Assignments1;

import java.util.Scanner;

public class ReverseInNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = 0, remainder = 0, reverse = 0;
		System.out.print("Enter a Number to reverse : ");
		number = sc.nextInt();
		while(number != 0) {
			remainder = number % 10;
			reverse = reverse * 10+ remainder;
			number = number/10;
		}
		System.out.println("The reverse of Number is :" + reverse);
		sc.close();
	}

}
