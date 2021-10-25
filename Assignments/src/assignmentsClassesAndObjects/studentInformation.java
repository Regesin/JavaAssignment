package assignmentsClassesAndObjects;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.Scanner;

public class studentInformation {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));

		String name, studentId;
		int[] marks = new int[3];
		System.out.println("Enter the Name of Student : ");
		name = sc.nextLine();
		System.out.println("Enter the Student ID ");
		studentId = sc.nextLine();
		System.out.println("Enter the Marks of Student :");
		for (int i = 0; i < 3; i++) {
			marks[i] = sc.nextInt();
		}
		student stu = new student(name, studentId, marks);
		stu.getDetails();
		stu.getGrades();
		System.out.println("Enter the Name of Student : ");
		name = inp.readLine();
		System.out.println("Enter the Student ID ");
		studentId = inp.readLine();
		System.out.println("Enter the Marks of Student :");
		for (int i = 0; i < 3; i++) {
			marks[i] = sc.nextInt();
		}
		student stu1 = new student(name, studentId, marks);
		stu1.getDetails();
		stu1.getGrades();
		
		sc.close();

	}

}
