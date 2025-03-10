// Class with multiple constructors
class MyClass {
    int num;
    String text;

    // Default Constructor
    MyClass() {
        this.num = 0;
        this.text = "Default";
        System.out.println("Default Constructor Called");
    }

    // One Argument Constructor
    MyClass(int num) {
        this.num = num;
        this.text = "Single Argument";
        System.out.println("One Argument Constructor Called");
    }

    // Two Argument Constructor
    MyClass(int num, String text) {
        this.num = num;
        this.text = text;
        System.out.println("Two Argument Constructor Called");
    }

    // Method to display values
    void display() {
        System.out.println("Number: " + num + ", Text: " + text);
    }
}

// Main Class
public class ConstructorOverloadingDemo {
    public static void main(String[] args) {
        // Calling Default Constructor
        MyClass obj1 = new MyClass();
        obj1.display();

        // Calling One Argument Constructor
        MyClass obj2 = new MyClass(10);
        obj2.display();

        // Calling Two Argument Constructor
        MyClass obj3 = new MyClass(20, "Hello, Bro!");
        obj3.display();
    }
}
