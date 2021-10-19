package Assignments1;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp=0, number=0;
		temp = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to get the Pattern : ");
		number = sc.nextInt();
		for (int i = 1; i < number; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(temp++);
			}
			System.out.print(" ");
		}
		sc.close();
	}

}
