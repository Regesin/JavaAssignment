package Assignments1;

import java.util.Scanner;

public class ArrayReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = 0, j = 0;
		System.out.print("Enter the No of Elements in Array :");
		number = sc.nextInt();
		int[] array = new int[number];
		int[] reversedarray = new int[number];
		for (int i = 0; i < number; i++) {
			array[i] = sc.nextInt();
		}
		System.out.print("Before reversed is :");
		for (int i = 0; i < number; i++) {
			System.out.print(" " + array[i]);
		}
		for (int i = number - 1; i >= 0; i--) {
			reversedarray[j++] = array[i];
		}
		System.out.println();
		System.out.print("Reversed array is  : ");
		for (int i = 0; i < number; i++) {
			System.out.print(" " + reversedarray[i]);
		}
		sc.close();
	}
}
