package assignmentsClassesAndObjects;

public class Vehicle {
	String name, model;
	double price = 0;

	public Vehicle(String name, String model, double price) {
		super();
		this.name = name;
		this.model = model;
		this.price = price;
	}

	public void getDetails() {
		System.out.println("Name of the Vehicle is : " + name);
		System.out.println("Model of the Vehicle is : " + model);
		System.out.println("Price of the Vehicle is : " + price);
	}

}