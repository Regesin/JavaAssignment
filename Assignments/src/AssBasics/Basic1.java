package AssBasics;

public class Basic1 {

	public static void main(String[] args) {
		int Integer1, Integer2, Integer3, result;
		Integer1 = 10;
		Integer2 = 17;
		Integer3 = 11;
		result = Integer3 > (Integer1 > Integer2 ? Integer1 : Integer2) ? Integer3
				: ((Integer1 > Integer2) ? Integer1 : Integer2);
		System.out.println("The Gratest number is : " + result);

	}

}
