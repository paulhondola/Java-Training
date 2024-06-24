// 1. Write a Java program to create a class called Animal with a method called makeSound(). Create a subclass called Cat that overrides the makeSound() method to bark.

class Animal {

	protected void makeSound() {
		System.out.println("Animal");
	}
}

class Cat extends Animal {

	protected void makeSound() {
		System.out.println("Meow");
	}
}

class Ex1 {

	public static void main(String args[]) {
		Animal animal = new Animal();

		animal.makeSound();

		Cat cat = new Cat();

		cat.makeSound();
	}
}
