package Assignments1;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size_of_array = 0;
		System.out.println("Enter the size of the array : ");
		size_of_array = sc.nextInt();
		int[] array = new int[size_of_array];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		Arrays.sort(array);
		System.out.println("The Greatest in the array is : " + array[array.length - 2]);
		sc.close();
	}

}
