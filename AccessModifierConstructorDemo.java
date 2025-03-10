// Parent Class
class Parent {
    // Public Constructor
    public Parent() {
        System.out.println("Public Constructor of Parent Called");
    }

    // Protected Constructor
    protected Parent(int num) {
        System.out.println("Protected Constructor of Parent Called with value: " + num);
    }

    // Default Constructor (no modifier)
    Parent(String text) {
        System.out.println("Default Constructor of Parent Called with text: " + text);
    }

    // Private Constructor (Accessible only inside Parent class)
    private Parent(double value) {
        System.out.println("Private Constructor of Parent Called with value: " + value);
    }

    // Method to access private constructor inside the same class
    public static Parent createInstance() {
        return new Parent(99.99); // Calling private constructor inside the class
    }
}

// Child Class
class Child extends Parent {
    // Calling Parent's Public Constructor
    public Child() {
        super(); // Calls public constructor
        System.out.println("Child Public Constructor Called");
    }

    // Calling Parent's Protected Constructor
    protected Child(int num) {
        super(num); // Calls protected constructor
        System.out.println("Child Protected Constructor Called");
    }

    // Calling Parent's Default Constructor
    Child(String text) {
        super(text); // Calls default constructor
        System.out.println("Child Default Constructor Called");
    }
}

// Main Class
public class AccessModifierConstructorDemo {
    public static void main(String[] args) {
        // Calling Public Constructor
        System.out.println("Creating object using Public Constructor:");
        Child obj1 = new Child();

        System.out.println("\nCreating object using Protected Constructor:");
        Child obj2 = new Child(10);

        System.out.println("\nCreating object using Default Constructor:");
        Child obj3 = new Child("Hello, Bro!");

        System.out.println("\nCreating object using Private Constructor (via static method):");
        Parent obj4 = Parent.createInstance(); // Calls private constructor inside Parent
    }
}
