// 1. Write a Java program to create an interface Shape with the getArea() method.
// Create three classes Rectangle, Circle, and Triangle that implement the Shape interface.
//  Implement the getArea() method for each of the three classes.

interface Shape {
    double getArea();
}

class Rectangle implements Shape {

    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}

class Ex1 {

    public static void main(String args[]) {
        var rectangle = new Rectangle(2, 3);

        rectangle.length = 3;

        System.out.println(rectangle.getArea());
    }
}
