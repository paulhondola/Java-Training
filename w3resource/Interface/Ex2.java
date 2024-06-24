// 2. Write a Java program to create a Animal interface with a method called bark() that takes no arguments and returns void.
// Create a Dog class that implements Animal and overrides speak() to print "Dog is barking".

interface Animal {
    void speak();
}

class Dog implements Animal {

    public void speak() {
        System.out.println("Woof");
    }
}

class Ex2 {

    public static void main(String args[]) {
        var dog = new Dog();

        dog.speak();
    }
}
