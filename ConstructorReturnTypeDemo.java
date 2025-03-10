class Example {
    int value;

    
    int Example() {
        System.out.println("This is NOT a constructor. It's a method returning int.");
        return 10; // Returns an integer
    }

    
    String Example(String text) {
        System.out.println("This is NOT a constructor. It's a method returning String.");
        return text;
    }

   
    Example() {
        System.out.println("This is a real constructor. No return type!");
        this.value = 100;
    }
}

// Main Class
public class ConstructorReturnTypeDemo {
    public static void main(String[] args) {
        // Creating an object (Calls the correct constructor)
        Example obj = new Example();

        // Calling the incorrect "constructors" (which are actually methods)
        int num = obj.Example();
        String str = obj.Example("Hello, Bro!");

        // Printing returned values
        System.out.println("Returned int: " + num);
        System.out.println("Returned String: " + str);
    }
}
