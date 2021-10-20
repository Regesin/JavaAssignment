package AssBasics;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name;
		String[] array1 = { "anu019", "annaya87", " joe876" };
		System.out.println("Enter username to Login");
		name = sc.nextLine();

		for (int i = 0; i < array1.length; i++) {
			if(array1[i].equals(name)) {
				System.out.println("You are logged in sucessfully");
				System.exit(10);
			}
		}
		System.out.println("Invaild Username");

		sc.close();

	}

}
