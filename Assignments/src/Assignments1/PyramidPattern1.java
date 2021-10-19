package Assignments1;

import java.util.Scanner;

public class PyramidPattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to get the Pyramid :");
		number = sc.nextInt();
		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= number - i; j++) {
				System.out.print("  ");
			}
			// use for loop where k is less than equal to (2 * i -1)
			for (int k = 1; k <= (2 * i - 1); k++) {
				System.out.print("* "); // print the Star
			}
			System.out.println();
		}
		sc.close();
	}

}
