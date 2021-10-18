package Assignments1;

import java.util.Scanner;
import java.lang.Math;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int originalinteger = 0, copyInteger = 0, remainder = 0, count = 0, tempinteger = 0;
		double  result = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find Armstrong Number :");
		originalinteger = sc.nextInt();
		copyInteger = originalinteger;
		tempinteger = originalinteger;
		while(tempinteger !=0) {
			tempinteger = tempinteger/10;
			++count;
		}
		while (originalinteger != 0) {
			remainder = originalinteger % 10;
			result = result + Math.pow(remainder, count);
			originalinteger = originalinteger / 10;
		}
		if (result == copyInteger) {
			System.out.println("Number is Armstrong Number");
		} else {
			System.out.println("Number is Not Armstrong Number");
		}
		sc.close();
	}

}
