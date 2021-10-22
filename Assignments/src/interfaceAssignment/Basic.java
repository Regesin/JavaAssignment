package interfaceAssignment;

public class Basic implements BasicCalculator {

	@Override
	public void add(int x, int y) {
		System.out.println("The Addition of two numbers is : "+(x+y));
	}

	@Override
	public void difference(int x, int y) {
		System.out.println("The Substraction of two numbers is : "+(x-y));

	}

	@Override
	public void product(int x, int y) {
		System.out.println("The Product of two numbers is : "+(x%y));

	}

	@Override
	public void divide(int x, int y) {
		System.out.println("The Division of two numbers is : "+(x/y));

	}

}
