// 9. Write a Java program to create a vehicle class hierarchy. The base class should be Vehicle, with subclasses Truck, Car and Motorcycle. Each subclass should have properties such as make, model, year, and fuel type. Implement methods for calculating fuel efficiency, distance traveled, and maximum speed.

abstract class Vehicle {

	String make;
	String model;
	int year;
	String fuelType;

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
