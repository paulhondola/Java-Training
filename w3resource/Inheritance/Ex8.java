// 8. Write a Java program to create a class called Shape with methods called getPerimeter() and getArea(). Create a subclass called Circle that overrides the getPerimeter() and getArea() methods to calculate the area and perimeter of a circle.

import java.lang.Math;

abstract class Shape {

    double area;
    double perimeter;

    double getPerimeter() {
        return perimeter;
    }

    double getArea() {
        return area;
    }
}

class Circle extends Shape {

    double radius;

    Circle(double radius) {
        this.radius = radius;
        area = Math.PI * radius * radius;
        perimeter = 2 * Math.PI * radius;
    }
}

class Ex8 {

    public static void main(String args[]) {
        Circle circle = new Circle(5);

        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());
    }
}
