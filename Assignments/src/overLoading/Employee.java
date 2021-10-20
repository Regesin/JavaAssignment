package overLoading;

public class Employee {
	String name, designation;
	double allowance = 0;

	public Employee(String name, String designation) {
		super();
		this.name = name;
		this.designation = designation;
	}

	public double calcBonus(double basicAllowance) {
		System.out.println("Name " + name);
		System.out.println("Designation : " + designation);
		System.out.println("Bonus : " + basicAllowance);
		return basicAllowance;
	}

	public double calcBonus(double basicAllowance, double carAllowance) {
		allowance = basicAllowance + carAllowance;
		System.out.println("Name " + name);
		System.out.println("Designation : " + designation);
		System.out.println("Bonus : " + allowance);
		return allowance;
	}

	public double calcBonus(double basicAllowance, double carAllowance, double housingAllowance) {
		allowance = basicAllowance + carAllowance + housingAllowance;
		System.out.println("Name " + name);
		System.out.println("Designation : " + designation);
		System.out.println("Bonus : " + allowance);
		return allowance;
	}

}
