package Assignments1;
import java.util.Scanner;
public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int integer =0, divisiors = 0, copyinteger = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check Perfect Number : ");
		integer = sc.nextInt();
		copyinteger = integer;
		for(int i = 1;i<integer;i++) {
			if(integer % i == 0 & integer != 0) {
				divisiors = divisiors + i; 
			}
		}
		if(divisiors == copyinteger) {
			System.out.println("It is Perfect Number");
		}
		else {
			System.out.println("It is Not a Perfect Number");
		}
		sc.close();
	}
	

}
