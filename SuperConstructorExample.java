// Superclass (Parent)
class Parent {
    // Default Constructor
    Parent() {
        System.out.println("Parent Default Constructor Called");
    }

    // Parameterized Constructor
    Parent(int num) {
        System.out.println("Parent Argument Constructor Called with value: " + num);
    }
}

// Subclass (Child)
class Child extends Parent {
    // Child Default Constructor calls Parent Default Constructor
    Child() {
        super(); // Calls Parent Default Constructor
        System.out.println("Child Default Constructor Called");
    }

    // Child Argument Constructor calls Parent Argument Constructor
    Child(int num) {
        super(num); // Calls Parent Parameterized Constructor
        System.out.println("Child Argument Constructor Called with value: " + num);
    }
}

// Main Class
public class SuperConstructorExample {
    public static void main(String[] args) {
        // Calling Default Constructor
        System.out.println("Creating Child object with Default Constructor:");
        Child obj1 = new Child();

        System.out.println("\nCreating Child object with Argument Constructor:");
        // Calling Argument Constructor
        Child obj2 = new Child(100);
    }
}
