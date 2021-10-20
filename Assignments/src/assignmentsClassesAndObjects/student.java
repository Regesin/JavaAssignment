package assignmentsClassesAndObjects;

import java.util.Scanner;

public class student {
	String name, studentId;
	int subjects = 0;
	double sum = 0;
	float average = 0f;
	int[] marks = new int[3];
	Scanner sc = new Scanner(System.in);

	public student(String name, String studentId, int[] marks) {
		super();
		this.name = name;
		this.studentId = studentId;
		this.marks = marks;
	}

	public void getDetails() {
		System.out.println("Student Name is : " + name);
		System.out.println("Studnet ID is :" + studentId);
	}

	public void getGrades() {
		for (int i = 0; i < marks.length; i++) {
			sum = sum + marks[i];
		}
		System.out.println("The sum of marks is : " + sum);
		average = (float) sum / marks.length;
		System.out.println("The Average is : " + average);
		if (average > 25) {
			System.out.println("Grade A");
		} else if (average < 25 & average > 15) {
			System.out.println("Grade B");
		} else {
			System.out.println("Grade C");
		}

	}

}
