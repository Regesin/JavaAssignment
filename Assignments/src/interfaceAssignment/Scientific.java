package interfaceAssignment;

public class Scientific extends Basic implements ScientificCalculator {

	

	@Override
	public void square(int x) {
		System.out.println("The Square of a number is :"+(x*x));
	}

	@Override
	public void cube(int x) {
		System.out.println("The Cube of a number is :"+(x*x*x));

	}

}
