// 12. Write a Java program to create an abstract class GeometricShape with abstract methods area() and perimeter(). Create subclasses Triangle and Square that extend the GeometricShape class and implement the respective methods to calculate the area and perimeter of each shape.

import java.lang.Math;

abstract class GeometricShape {

	double area;
	double perimeter;

	abstract double area();

	abstract double perimeter();
}

class Triangle extends GeometricShape {

	double base;
	double height;
	double side1;
	double side2;
	double side3;

	Triangle(double base, double height, double side1, double side2, double side3) {
		this.base = base;
		this.height = height;
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	double area() {
		return 0.5 * base * height;
	}

	double perimeter() {
		return side1 + side2 + side3;
	}
}

class Square extends GeometricShape {

	double side;

	Square(double side) {
		this.side = side;
	}

	double area() {
		return side * side;
	}

	double perimeter() {
		return 4 * side;
	}
}

class Circle extends GeometricShape {

	double radius;

	Circle(double radius) {
		this.radius = radius;
	}

	double area() {
		return Math.PI * radius * radius;
	}

	double perimeter() {
		return 2 * Math.PI * radius;
	}
}

class Ex12 {

	public static void main(String args[]) {
		var triangle = new Triangle(3, 4, 5, 4, 3);

		System.out.println("Triangle Area: " + triangle.area());
		System.out.println("Triangle Perimeter: " + triangle.perimeter());

		var square = new Square(5);

		System.out.println("Square Area: " + square.area());
		System.out.println("Square Perimeter: " + square.perimeter());

		var circle = new Circle(5);

		System.out.println("Circle Area: " + circle.area());
		System.out.println("Circle Perimeter: " + circle.perimeter());
	}
}
