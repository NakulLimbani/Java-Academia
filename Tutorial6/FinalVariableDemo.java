public class FinalVariableDemo {
    public static void main(String[] args) {
        final int constantValue = 42; // Declare and initialize a final variable

        // Attempting to change the value of a final variable will result in a compilation error.
        // constantValue = 50; // Uncommenting this line will cause a compilation error.

        System.out.println("The value of the final variable is: " + constantValue);

        // Final variables can also be used with non-primitive types, such as strings.
        final String greeting = "Hello, World!";
        // greeting = "New Greeting"; // This will cause a compilation error.

        System.out.println(greeting);
    }
}
