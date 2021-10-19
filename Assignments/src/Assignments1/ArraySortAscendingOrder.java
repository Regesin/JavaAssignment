package Assignments1;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySortAscendingOrder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = 0;
		System.out.print("Enter the No of Elements in Array :");
		number = sc.nextInt();
		int[] array = new int[number];
		for (int i = 0; i < number; i++) {
			array[i] = sc.nextInt();
		}
		System.out.print("Before Sorting  is :");
		for (int i = 0; i < number; i++) {
			System.out.print(" " + array[i]);
		}
		Arrays.sort(array);
		System.out.println();
		System.out.print("After  Sorting  is :");
		for (int i = 0; i < number; i++) {
			System.out.print(" " + array[i]);
		}

		sc.close();
	}

}
