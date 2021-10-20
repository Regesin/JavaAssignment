package overLoading;

import java.util.Scanner;


public class AllowanceCheck {

		// TODO Auto-generated method stub
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String name, designation;

			System.out.println("Enter the Name : ");
			name = sc.nextLine();
			System.out.println("Enter the designation : ");
			designation = sc.nextLine();
			if (designation.equals("Manager")) {
				Employee employee1 = new Employee(name, designation);
				employee1.calcBonus(10000);
			} else if (designation.equals("Programmer")) {
				Employee employee2 = new Employee(name, designation);
				employee2.calcBonus(10000, 20000);
			} else {
				Employee employee2 = new Employee(name, designation);
				employee2.calcBonus(10000, 20000, 20000);
			}
			sc.close();
		}

	}

