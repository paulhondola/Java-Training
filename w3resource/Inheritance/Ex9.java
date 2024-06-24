// 9. Write a Java program to create a vehicle class hierarchy. The base class should be Vehicle, with subclasses Truck, Car and Motorcycle. Each subclass should have properties such as make, model, year, and fuel type. Implement methods for calculating fuel efficiency, distance traveled, and maximum speed.

abstract class Vehicle {

	String make;
	String model;
	int year;
	String fuelType;

	double fuelEfficiency;
	double distanceTraveled;
	double maximumSpeed;

	Vehicle(String make, String model, int year, String fuelType) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.fuelType = fuelType;
	}

	abstract double calculateFuelEfficiency();

	abstract double calculateDistanceTraveled();

	abstract double calculateMaximumSpeed();
}

class Truck extends Vehicle {

	Truck(String make, String model, int year, String fuelType) {
		super(make, model, year, fuelType);
	}

	double calculateFuelEfficiency() {
		return 10.0;
	}

	double calculateDistanceTraveled() {
		return 100.0;
	}

	double calculateMaximumSpeed() {
		return 100.0;
	}
}

class Car extends Vehicle {

	Car(String make, String model, int year, String fuelType) {
		super(make, model, year, fuelType);
	}

	double calculateFuelEfficiency() {
		return 20.0;
	}

	double calculateDistanceTraveled() {
		return 200.0;
	}

	double calculateMaximumSpeed() {
		return 200.0;
	}
}

class Ex9 {

	public static void main(String args[]) {
		var truck = new Truck("Ford", "F-150", 2018, "Gasoline");

		System.out.println("Fuel Efficiency: " + truck.calculateFuelEfficiency());
		System.out.println("Distance Traveled: " + truck.calculateDistanceTraveled());
		System.out.println("Maximum Speed: " + truck.calculateMaximumSpeed());

		var car = new Car("Toyota", "Corolla", 2018, "Gasoline");

		System.out.println("Fuel Efficiency: " + car.calculateFuelEfficiency());
		System.out.println("Distance Traveled: " + car.calculateDistanceTraveled());
		System.out.println("Maximum Speed: " + car.calculateMaximumSpeed());
	}
}
