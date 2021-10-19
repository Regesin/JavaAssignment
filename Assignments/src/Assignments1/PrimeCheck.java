package Assignments1;

import java.util.Scanner;

public class PrimeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int integer =0, divisiors = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check Prime Number : ");
		integer = sc.nextInt();
		for(int i = 1;i<integer;i++) {
			if(integer % i == 0 & integer != 0) {
				divisiors = divisiors + 1; 
			}
		}
		if(divisiors > 2) {
			System.out.println("It is Not a Prime Number");
		}
		else {
			System.out.println("It is  a Prime Number");
		}
		sc.close();

	}

}
