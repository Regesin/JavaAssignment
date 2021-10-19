package Assignments1;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int integer = 0, n1 = 0, n2 = 1, n3 = 0;
		System.out.print("0 1");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the series :");
		integer = sc.nextInt();
		System.out.print("0 1");

		for (int i = 2; i < integer; ++i)// loop starts from 2 because 0 and 1 are already printed
		{
			n3 = n1 + n2;
			System.out.print(" ");
			System.out.print(n3);
			n1 = n2;
			n2 = n3;
		}
		sc.close();
	}

}
