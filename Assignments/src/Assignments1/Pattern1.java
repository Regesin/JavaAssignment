package Assignments1;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to get the pattern :");
		number = sc.nextInt();
		int i, j;
		for(i = 1; i <= number; i++)
		{
		    for(j = 1; j <= i; j++)  
		    {          
		        System.out.print(i); 
		    }
		    System.out.print(" ");
		}


	}
}
