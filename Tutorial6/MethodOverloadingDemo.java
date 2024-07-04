class MethodOverloadingDemo {

    // Method with two integer parameters
    public int add(int a, int b) {
        return a + b;
    }

    // Method with three integer parameters
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method with two double parameters
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        MethodOverloadingDemo calculator = new MethodOverloadingDemo();

        // Call the method with two integer parameters
        int result1 = calculator.add(5, 7);
        System.out.println("Result 1: " + result1);

        // Call the method with three integer parameters
        int result2 = calculator.add(5, 7, 10);
        System.out.println("Result 2: " + result2);

        // Call the method with two double parameters
        double result3 = calculator.add(3.5, 2.5);
        System.out.println("Result 3: " + result3);
    }
}
