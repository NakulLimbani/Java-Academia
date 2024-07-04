public class StaticDemo {

    // Static field
    static int staticField = 0;

    // Non-static field
    int nonStaticField;

    static {
        // Static block (executed when the class is loaded)
        System.out.println("Static block is executed");
        staticField = 42; // Initialize the static field in the static block
    }

    // Static method
    static void staticMethod() {
        System.out.println("Static method is called");
    }

    public static void main(String[] args) {
        // Accessing the static field
        System.out.println("Static Field: " + staticField);

        // Creating an instance of the class
        StaticDemo obj1 = new StaticDemo();
        obj1.nonStaticField = 100;

        StaticDemo obj2 = new StaticDemo();
        obj2.nonStaticField = 200;

        // Accessing non-static field
        System.out.println("Non-Static Field (obj1): " + obj1.nonStaticField);
        System.out.println("Non-Static Field (obj2): " + obj2.nonStaticField);

        // Calling the static method
        staticMethod();
    }
}

