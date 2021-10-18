package Assignments1;

import java.util.Arrays;
import java.util.Scanner;

public class SecondSmallestInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size_of_array = 0;
		System.out.println("Enter the size of the array : ");
		size_of_array = sc.nextInt();
		int[] array = new int[size_of_array];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		Arrays.sort(array);
		System.out.println("The Smallest in the array is : " + array[1]);
		sc.close();
	}
}
