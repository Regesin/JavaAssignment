package AssBasics;
import java.util.Scanner;

public class basic2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int Integer1, Integer2, Integer3;
		System.out.println("Enter the First no : ");
		Integer1 = sc.nextInt();
		System.out.println("Enter the Second no : ");
		Integer2 = sc.nextInt();
		System.out.println("Enter the Third no : ");
		Integer3 = sc.nextInt();
		if (Integer1 < Integer2 && Integer1 < Integer3) {
			System.out.println("The Smallest is : "+ Integer1);
		}
		else if (Integer2 < Integer1 && Integer2 < Integer3) {
			System.out.println("The Smallest is : "+ Integer2);
		}
		else {
			System.out.println("The Smallest is : "+ Integer3);
		}
		sc.close();

	}

}
