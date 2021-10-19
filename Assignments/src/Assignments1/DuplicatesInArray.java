package Assignments1;

import java.util.Scanner;

public class DuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = 0, count = 0;
		System.out.print("Enter the no of Elements in Array : ");
		number = sc.nextInt();
		int[] array = new int[number];
		for (int i = 0; i < number; i++) {
			array[i] = sc.nextInt();
		}
		for (int i = 0; i < number; i++) {
			for (int j = i+1; j < number; j++) {
				if (array[i] == array[j]) {
					count = count + 1;
				}
			}

		}

		System.out.println(" The Duplicates in Array are :" + count);
		sc.close();
	}

}
