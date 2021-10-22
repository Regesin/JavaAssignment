package interfaceAssignment;

public class MainClass {

	public static void main(String[] args) {

		BasicCalculator ref = new Basic();
		ref.add(10, 10);
		ref.difference(10, 10);
		ref.product(15, 3);
		ref.divide(100, 2);
		
		ScientificCalculator scientific = new Scientific();
		scientific.square(5);
		scientific.cube(5);
	}

}
