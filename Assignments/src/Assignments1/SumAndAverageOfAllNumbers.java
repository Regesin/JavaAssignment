package Assignments1;

import java.util.Scanner;

public class SumAndAverageOfAllNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0, average=0, integer=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers of elements in Array : ");
		integer = sc.nextInt();
		int[] array1 = new int[integer];
		for (int i = 0; i < array1.length; i++) {
			array1[i] = sc.nextInt();
		}
		for (int i = 0; i < array1.length; i++) {
			sum += array1[i];
		}
		System.out.println("The sum is : " + sum);
		average = (sum) / array1.length;
		System.out.println("The Avg is : " + average);
		sc.close();

	}

}
