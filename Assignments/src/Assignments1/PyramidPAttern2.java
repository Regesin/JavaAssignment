package Assignments1;

import java.util.Scanner;

public class PyramidPAttern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 0, temp = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to get the Pyramid :");
		number = sc.nextInt();
		for (int i = number; i >= 1; i--) {

			for (int j = 1; j <= temp; j++) {
				System.out.print("  "); // print the space
			}

			for (int k = 1; k <= (2 * i - 1); k++) {
				System.out.print("* "); // print the Star
			}
			temp++;
			System.out.println();
		}
		sc.close();
	}
}
