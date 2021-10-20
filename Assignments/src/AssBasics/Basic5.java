package AssBasics;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

public class Basic5 {
	public static void main(String[] args) {
		int elements = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Length of Array : ");
		elements = sc.nextInt();
		int[] array1 = new int[elements];
		for (int i = 0; i < array1.length; i++) {
			array1[i] = sc.nextInt();
		}
		double[] array2 = Arrays.stream(array1).asDoubleStream().toArray();
		for (int i = 0; i < array2.length; i++) {
			array2[i] = Math.sqrt(array2[i]);
		}
		System.out.println("The Squareroot of numbers in Array is : ");
		for (int i = 0; i < array2.length; i++) {
			System.out.print(" " + array2[i]);
		}
		sc.close();
	}
}
