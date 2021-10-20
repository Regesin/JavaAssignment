package AssBasics;

import java.util.Scanner;

public class Basic4 {
	public static void main(String[] args) {
		int sum = 0, average, elements = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Length of Array : ");
		elements = sc.nextInt();
		int[] array1 = new int[elements];
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
