package Assignments1;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count1 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Length of the Array :");
		int lengthOfArray = sc.nextInt();

		int[] numbers = new int[lengthOfArray];
		System.out.println("Enter Elements in Array :");
		for (int i = 0; i < numbers.length; i++) {

			numbers[i] = sc.nextInt();

		}
		int[] newArray = new int[numbers.length];
		int visited = -1;

		for (int i = 0; i < numbers.length; i++) {
			int count = 1;
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] == numbers[j]) {
					count++;
					// To avoid counting same element again
					newArray[j] = visited;
				}
			}
			if (newArray[i] != visited) {
				newArray[i] = count;
			}
		}

		// Displays the frequency of each element present in array
		for (int i = 0; i < newArray.length; i++) {
			if (newArray[i] != visited && newArray[i] > 1)
				count1 += newArray[i] - 1;
		}

		System.out.println("The Duplicate Numbers are " + count1);

		sc.close();
	}

}
