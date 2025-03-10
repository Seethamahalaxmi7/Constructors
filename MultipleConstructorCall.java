class Example {
    int value;

    // Constructor
    Example() {
        System.out.println("Constructor Called!");
        value = 100;
    }

    // Method to simulate constructor behavior
    void resetObject() {
        System.out.println("Resetting object values (Simulating Constructor Call)...");
        value = 100; // Resetting values
    }
}

public class MultipleConstructorCall {
    public static void main(String[] args) {
        // Creating an object (Constructor gets called once)
        Example obj = new Example();

        // Trying to call constructor again on the same object (❌ Not possible)
        // obj.Example();  // ❌ ERROR: Constructors cannot be called explicitly!

        // Alternative: Reset object values using a method
        obj.resetObject();

        // Creating a new object to call constructor again
        Example obj2 = new Example(); // ✅ Constructor gets called again for a new object
    }
}
