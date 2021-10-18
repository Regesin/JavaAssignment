package Assignments1;

public class OddNumbersUpTo20 {
	public static void main(String[] args) {
		System.out.println("The ODD numbers are :");
		for (int i = 0; i < 21; i++) {
			if (i % 2 != 0 && i != 0) {
				System.out.println(i);
			}
		}
	}
}
