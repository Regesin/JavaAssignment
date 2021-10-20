package AssBasics;

import java.util.Scanner;

public class Registration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name;
		String[] array1 = { "Ani", "Sam", " Joe" };
		System.out.println("Enter Name to register");
		name = sc.nextLine();

		for (int i = 0; i < array1.length; i++) {
			if(array1[i].equals(name)) {
				System.out.println("Name is Not Unique" );
				System.exit(10);
			}
		}
		System.out.println("You are registered ");

		sc.close();

	}

}
