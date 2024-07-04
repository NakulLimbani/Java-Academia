public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3, 4, 5};
            int index = 7; // Trying to access an out-of-bounds index

            // Attempt to access an element outside the array's bounds
            int result = numbers[index];
            System.out.println("The value at index " + index + " is: " + result);

        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle the exception for an out-of-bounds array access
            System.err.println("ArrayIndexOutOfBoundsException: Index is out of bounds");
        } catch (Exception e) {
            // Handle any other exceptions
            System.err.println("An error occurred: " + e.getMessage());
        } finally {
            // This block will execute regardless of whether an exception occurs or not.
            System.out.println("Finally block executed");
        }

        // Code execution continues after the exception is handled
        System.out.println("Program continues after exception handling");
    }
}
